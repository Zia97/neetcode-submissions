class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int lowestSeenPrice = prices[0];

        for(int price:prices){

            if(price<lowestSeenPrice){
                lowestSeenPrice = price;
            }

            int profit = price - lowestSeenPrice;
            
            if(profit>maxProfit){
                maxProfit = profit;
            }
        }

        
        return maxProfit;
    }
}
