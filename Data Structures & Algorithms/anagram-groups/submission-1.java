class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> keyList = new HashMap();

        for(String str : strs){

            char[] key = str.toCharArray();
            Arrays.sort(key);

            String sortedKey = new String(key);

            keyList.putIfAbsent(sortedKey, new ArrayList<>());
            keyList.get(sortedKey).add(str);
        }
        
        return new ArrayList<>(keyList.values());

    }
}
