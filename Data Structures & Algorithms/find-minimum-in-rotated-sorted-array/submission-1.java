class Solution {
    public int findMin(int[] nums) {

        int smallest = nums[0];

        int l=0;
        int r=nums.length-1;

        // 3,4,5,1,2
        while(l<=r){

            if(nums[l] < nums[r]){
                smallest = Math.min(smallest, nums[l]);
                break;
            }


            //  int midPoint = l + (r - l) / 2;
            int midPoint = (r+l) / 2;
            smallest = Math.min(smallest, nums[midPoint]);
            if(nums[midPoint] >= nums[l]){
                l = midPoint+1;
            }else{
                r = midPoint-1;
            }


        }

        return smallest;
        
    }
}
