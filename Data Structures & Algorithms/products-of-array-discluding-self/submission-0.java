class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] output = new int[nums.length];
        
        int zeroCount = 0;

        int total = 1;

        for (int num: nums){
            if(num!=0){
                total *= num;
            }else{
                zeroCount++;
            }
        }

        if (zeroCount >= 2){
            return output;
        }

        for(int i=0; i<nums.length; i++){
            if(zeroCount==1){
                output[i] = nums[i] == 0 ? total : 0;
            }
            else{
                output[i] = total / nums[i];
            }
        }

        return output;
    }
}  
