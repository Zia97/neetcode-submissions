class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> results = new ArrayList();

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
                    results.add(foundResult);
                    l++;
                    r--;
                    while(l<r && nums[l] == nums[l-1]){
                        l++;
                    }
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
    