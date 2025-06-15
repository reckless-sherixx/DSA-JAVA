package Arrays.PracticeQuestions;

public class Question3 {
    public static int buyAndSellStock(int prices[]) {
        int maximumProfit = 0;
        int buyPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maximumProfit = Math.max(maximumProfit, profit);
            } else {
                buyPrice = prices[i];
            }

        }
        return maximumProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 4, 2, 1, 2 };
        System.out.println(buyAndSellStock(prices));
    }
}
