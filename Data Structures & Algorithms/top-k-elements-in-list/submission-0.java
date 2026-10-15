class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> valueAndFrequency = new HashMap();

        for(int num: nums){
            valueAndFrequency.put(num, valueAndFrequency.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] frequencyArray = new List[nums.length + 1];

        for(int i=0; i<frequencyArray.length; i++){
            frequencyArray[i] = new ArrayList();
        }

    
        for(HashMap.Entry<Integer,Integer> entry: valueAndFrequency.entrySet()){
            frequencyArray[entry.getValue()].add(entry.getKey());
        }


        int[] kValues = new int[k];
        int kCounter = 0;

        for(int i = frequencyArray.length-1; i>0 & kCounter<k; i--){

            for(int n: frequencyArray[i]){
                kValues[kCounter] = n;
                kCounter++;
                if(kCounter == k){
                    return kValues;
                }
            }
   
        }

        return kValues;
        
    }
}
