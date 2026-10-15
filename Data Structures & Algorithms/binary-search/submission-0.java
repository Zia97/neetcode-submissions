class Solution {
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length;
        int midPoint = (r+l)/2;

        boolean found = false;

        while(!found){
            int midVal = nums[midPoint];

            if(midVal == target){
                return midPoint;
            }else if(midVal < target){
               l = midPoint;
            }else{
                r = midPoint;
            }
            int previousMidpoint = midPoint;
            midPoint = (r+l) / 2;
            if(previousMidpoint == midPoint){
                return -1;
            }
        }
        return -1;
    }
}
