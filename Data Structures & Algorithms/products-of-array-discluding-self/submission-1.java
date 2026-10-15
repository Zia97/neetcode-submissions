class Solution {
    public int[] productExceptSelf(int[] nums) {

        int zeroCount = 0;
        int cumalativeTotal = 1;
        int oneZeroPosition = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                oneZeroPosition = i;
                zeroCount++;
            }else{
                cumalativeTotal=cumalativeTotal*nums[i];
            }
        }

        int res[] = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            if(zeroCount > 1){
                res[i] = 0;
            }
            else if(zeroCount == 1 && oneZeroPosition == i){
                res[i] = cumalativeTotal;
            }
            else if(zeroCount == 1 &&  oneZeroPosition != i){
                res[i] = 0;
            }
            else{
                res[i] = cumalativeTotal/nums[i];
            }
        }

        return res;

    }
}  
