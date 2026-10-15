class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int lowestSeenPrice = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            int currentValue = prices[i];
            if(currentValue<lowestSeenPrice){
                lowestSeenPrice = currentValue;
            }else{
                continue;
            }
            for(int j=i+1; j<prices.length; j++){
                int profit = prices[j] - currentValue;
                if(profit>maxProfit){
                    maxProfit = profit;
                }
            }

        }
        
        return maxProfit;
    }
}
