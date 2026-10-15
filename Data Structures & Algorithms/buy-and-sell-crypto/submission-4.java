class Solution {
    public int maxProfit(int[] prices) {

        int lowestBuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length-1; i++){

            if(prices[i] < lowestBuyPrice){ // only check if found a lower buying price

                lowestBuyPrice = prices[i];
                for (int j=i+1; j<prices.length; j++){
                    int profit = prices[j] - prices[i];

                    if(profit>maxProfit){
                        maxProfit = profit;
                    }

                }
            }

        }
        return maxProfit;
    }
}
