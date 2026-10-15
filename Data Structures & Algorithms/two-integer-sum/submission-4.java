class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> valueAndIndex = new HashMap();

        for (int i = 0; i<nums.length; i++){
            
            int requiredValue = target - nums[i];
            if(valueAndIndex.containsKey(requiredValue)){

                int secondIndex = valueAndIndex.get(requiredValue);


                return new int[]{i>secondIndex ? secondIndex : i, i>secondIndex ? i : secondIndex};
            }
            valueAndIndex.put(nums[i], i);
        }
        return null;
    }
}
