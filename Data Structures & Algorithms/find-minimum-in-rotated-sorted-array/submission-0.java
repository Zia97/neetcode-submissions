class Solution {
    public int findMin(int[] nums) {

        int smallest = Integer.MAX_VALUE;

        int l=0;
        int r=nums.length-1;

        while(l<=r){
            int left = nums[l];
            int right = nums[r];

            if(left<smallest){
                smallest = left;
            }
            if(right<smallest){
                smallest = right;
            }

            l++;
            r--;

        }

        return smallest;
        
    }
}
