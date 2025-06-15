package Arrays.PracticeQuestions;

public class Question3 {
    public static int buyAndSellStock(int prices[]) {
        int maxProfit = 0;
        int buyPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 4, 2, 1, 2 };
        System.out.println(buyAndSellStock(prices));
    }
}
