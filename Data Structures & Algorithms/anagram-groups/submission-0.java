class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> listOfAnagramLists = new ArrayList<>();

        for(String str : strs){

            boolean foundParent = false;
           
           for(List<String> anagramList: listOfAnagramLists){
                    String stringToCompare = anagramList.get(0);
                    if(isAnagram(str, stringToCompare)){
                        foundParent = true;
                        anagramList.add(str);
                    }
                }
            
            if(!foundParent){
                ArrayList<String> list = new ArrayList();
                list.add(str);
                listOfAnagramLists.add(list);
            }

        }
        return listOfAnagramLists;
    
    }

    public boolean isAnagram(String s, String t){
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
    
        return Arrays.equals(sArray, tArray);
    }
}
