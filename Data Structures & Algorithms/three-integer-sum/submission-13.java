class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> results = new ArrayList();
        Set<String> foundRes = new HashSet();

        for (int i=0; i<nums.length-2; i++){

            int currentOuterValue = nums[i];

            int l=i+1;
            int r=nums.length-1;

            if(i>0 && nums[i-1] == nums[i]){
                continue;
            }

            while(l<r){
                int currentResult = currentOuterValue + nums[l] + nums[r];
                if(currentResult == 0 ){
                    ArrayList<Integer> foundResult = new ArrayList<>();
                    foundResult.add(currentOuterValue);
                    foundResult.add(nums[l]);
                    foundResult.add(nums[r]);

                    String strRep = Arrays.toString(foundResult.toArray());

                    if(!foundRes.contains(strRep)){
                        results.add(foundResult);
                        foundRes.add(strRep);
                    }
                    l++;
                }else if(currentResult > 0 ){
                    r--;
                }else{
                    l++;
                }

            }
    
    }

    return results;
    }
}
    