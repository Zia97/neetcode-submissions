class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] results = new int[2];
        
        HashMap<Integer, Integer> valueAndIndex = new HashMap();

        for (int i=0; i<nums.length; i++){
            int currentVal = nums[i];
            int requiredVal = target-currentVal;
            if(valueAndIndex.containsKey(requiredVal)){
                int secondIndex = valueAndIndex.get(requiredVal);

                if(i<secondIndex){
                    results[0] = i;
                    results[1] = secondIndex;
                }else{
                    results[0] = secondIndex;
                    results[1] = i;
                }
            }
            valueAndIndex.put(nums[i], i);
        }

        return results;

    }
}
