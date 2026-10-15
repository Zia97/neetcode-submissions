class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> numberAndPosition = new HashMap();

        for(int i=0; i<nums.length; i++){
            numberAndPosition.put(nums[i], i);
        }

           for(int i=0; i<nums.length; i++){
                                int requiredValue = target-nums[i];

            if(numberAndPosition.containsKey(requiredValue) && (numberAndPosition.get(requiredValue) != i)){
                int[] arr = {i, numberAndPosition.get(requiredValue)};
                return arr;
            }
        }
        
        return null;
    }
}
