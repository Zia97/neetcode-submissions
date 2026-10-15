class Solution {
    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer,Integer> numberAndPos = new HashMap();

        for (int i=0; i<numbers.length; i++){

            int currentVal = numbers[i];
            int requiredVal = target-currentVal;

            if(numberAndPos.containsKey(requiredVal)){
               return new int[]{numberAndPos.get(requiredVal), i+1};
            }else{
                numberAndPos.put(numbers[i], i+1);
            }

        }

        return null;
        
    }
}
