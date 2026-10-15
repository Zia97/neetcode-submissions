class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> keyAndValues = new HashMap();

        for(String str:strs){
            int[] charFrequency = new int[26];

            for(char c:str.toCharArray()){
                charFrequency[c-'a']++;
            }

            String key = Arrays.toString(charFrequency);
            keyAndValues.computeIfAbsent(key, k -> new ArrayList())
            .add(str);
        }        

        return new ArrayList<>(keyAndValues.values());
        
    }
}
