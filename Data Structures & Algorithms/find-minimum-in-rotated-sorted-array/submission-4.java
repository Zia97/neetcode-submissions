class Solution {
    public int findMin(int[] nums) {

        int l = 0;
        int r = nums.length-1;
        int smallest = Integer.MAX_VALUE;

        while(l<=r){

            int m = (l+r)/2;

            if(nums[m]<smallest){
                smallest = nums[m];
            }

            if(nums[l] < nums[r]){// left side is sorted
                r--;
            } 
            else{
                l++;
            }

        }

        return smallest;
        
    }
}
