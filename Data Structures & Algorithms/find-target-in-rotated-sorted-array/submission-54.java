class Solution {
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length-1;
        int midPoint = nums.length/2;

        while (l<=r){
            if(nums[midPoint] == target){
                return midPoint;
            }

            if(nums[l] < nums[midPoint]){ //left to mid is sorted in order (no rotation)

            if(nums[l] <= target && target < nums[midPoint]){
                r = midPoint - 1;
                System.out.println("r is now "+r);
            }else{
                l = midPoint + 1;
                 System.out.println("l is now "+l);
            }
   
            }else{ //mid to right is sorted in order (no rotation)

            if(nums[r] >= target && nums[midPoint] < target){
                l = midPoint + 1;
                 System.out.println("l is now "+l);
            }else{
                r = midPoint -1;
                System.out.println("r is now "+r);
            }
            
            }

            midPoint = (l+r+1)/2;

        }

        return -1;
        
    }
}
