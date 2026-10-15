class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer, Integer> foundNums = new HashMap();
        for(int i=0; i<nums.length; i++){

            if(foundNums.containsKey(nums[i])){
                return true;
            }else{
                foundNums.put(nums[i], 1);
            }

        }
        return false;
        
    }
}