class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0 ){
            return 0;
        }

       Set<Integer> values = new HashSet();

       int longestPath = 1;
       for(int i = 0; i<nums.length; i++){     
            values.add(nums[i]);
       }


        List<Integer> valuesList = new ArrayList<>(values);

        for(int i=0; i<values.size(); i++){

            int thisPath = 1;
            int currentValue = valuesList.get(i);

            if(!values.contains(currentValue-1)){

            

            while(true){
                if(values.contains(currentValue+1)){
                    thisPath++;
                    currentValue = currentValue +1;
                }else{
                    break;
                }
            }

            if(thisPath>longestPath){

                longestPath=thisPath;
            }
            }
        }

        return longestPath;
        
    }
}
