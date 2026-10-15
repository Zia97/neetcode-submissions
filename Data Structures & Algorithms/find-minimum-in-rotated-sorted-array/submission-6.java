class Solution {

    // [9 , -5 , -2 , 0 , 2 , 3] 

    public int findMin(int[] nums) {

        int l = 0;
        int r = nums.length-1;
        int smallest = nums[0];

        while(l<=r){

            int m = (l+r)/2;

            smallest = Math.min(nums[m], smallest);

            if(nums[l] < nums[r]){
                smallest = Math.min(smallest, nums[l]);
                break;
            }

            if(nums[r] > nums[m]){
                r = m-1;
            }else{
                l = m+1;
            }

            

        }

        return smallest;
        
    }
}
