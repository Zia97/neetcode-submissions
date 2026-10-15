class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> foundNumbers = new HashSet<>();

        for (int i=0; i<nums.length; i++){
            
            if(foundNumbers.contains(nums[i])){
                return true;
            }

            foundNumbers.add(nums[i]);
        }
        return false;
    }
}