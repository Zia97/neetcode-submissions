class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);

        List<List<Integer>> results = new ArrayList();

        for(int i=0; i<nums.length; i++){

            if(nums[i] > 0){
                break;
            }

            if( i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int l = i+1;
            int r = nums.length -1;

            while(l<r){
                int sum = nums[i]+ nums[l] + nums[r];

                if(sum == 0){
                    ArrayList<Integer> group = new ArrayList();
                    group.add(nums[i]);
                    group.add(nums[l]);
                    group.add(nums[r]);
                    results.add(group);
                    l++;
                    r--;

                    while(nums[l] == nums[l-1] && l<nums.length-1){
                        l++;
                    }
                }
                else if(sum>0){
                    r--;
                }
                else{
                    l++;
                }

            }

        }
        
        return results;
    }
}
