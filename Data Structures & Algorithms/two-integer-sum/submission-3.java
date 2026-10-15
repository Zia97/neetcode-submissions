class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> numberAndPosition = new HashMap();

        for(int i=0; i<nums.length; i++){
            int requiredValue = target-nums[i];

            if(numberAndPosition.containsKey(requiredValue)){
                return new int[] {numberAndPosition.get(requiredValue), i}; 
            }

            numberAndPosition.put(nums[i], i);
        }

        return null;
    }
}
