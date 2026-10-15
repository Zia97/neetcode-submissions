class Solution {
    public int maxArea(int[] heights) {

        int maxWater = 0;
        int l = 0;
        int r = heights.length-1;

        while(l<r){
            int heightL = heights[l];
            int heightR = heights[r];
            int distance = r-l;
            int maxHeight = heights[l] < heights[r] ? heights[l] : heights[r];
            int maxW = maxHeight*distance;
            if(maxW>maxWater){
                maxWater = maxW;
            }

            if(heightR>heightL){
                l++;
            }else{
                r--;
            }

        }

        return maxWater;
    }
}
