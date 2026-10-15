class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> keyAndValues = new HashMap();

        for(String str:strs){
            int[] charFrequency = new int[26];

            for(char c:str.toCharArray()){
                charFrequency[c-'a']++;
            }
            keyAndValues.putIfAbsent(Arrays.toString(charFrequency), new ArrayList());
            keyAndValues.get(Arrays.toString(charFrequency)).add(str);
        }        

        return new ArrayList<>(keyAndValues.values());
        
        
    }
}
