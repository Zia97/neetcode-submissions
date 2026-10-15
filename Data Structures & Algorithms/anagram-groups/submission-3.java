class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> keyAndAnagrams = new HashMap();

        for (String str: strs){
        
            int[] charFrequency = new int[26];

            char[] charArray = str.toCharArray();

            for(int i=0; i<str.length(); i++){

                charFrequency[charArray[i] - 'a']++;
            }

            String key = Arrays.toString(charFrequency);
            keyAndAnagrams.putIfAbsent(key, new ArrayList());
            keyAndAnagrams.get(key).add(str);

        }     
        return new ArrayList(keyAndAnagrams.values());

    }
}
