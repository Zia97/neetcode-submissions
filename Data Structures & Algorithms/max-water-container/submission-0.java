class Solution {
    public int maxArea(int[] heights) {

        int maxWater = 0;
        
        for(int l=0; l<heights.length-1; l++){

            int r = heights.length-1;
            while(l<r){
                int heightL = heights[l];
                int heightR = heights[r];
                int maxHeight = heightL<heightR ? heightL : heightR;
                int distance = r-l;
                int maxW = maxHeight*distance;
                if(maxW>maxWater){
                    maxWater = maxW;
                }
                r--;
            }
        }
        return maxWater;
    }
}
