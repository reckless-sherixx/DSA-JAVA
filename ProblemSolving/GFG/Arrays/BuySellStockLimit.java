package ProblemSolving.GFG.Arrays;

public class BuySellStockLimit {
    public int maximumProfit(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0 ;
        for(int i = 0 ; i< prices.length ; i++){
            if(prices[i] > buyPrice){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit , profit);
            }else{
                buyPrice = prices[i];
            }
        }
        if(maxProfit == 0){
            return 0;
        }
        return maxProfit;
    }
}
