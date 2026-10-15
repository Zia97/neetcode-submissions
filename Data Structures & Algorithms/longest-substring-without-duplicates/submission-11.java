class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length()==0){
            return 0;
        }

        int longestSubString = 1;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            int currentSubStringLength = 1;

            HashMap<Character, Integer> chars = new HashMap();
            chars.put(c, 1);
            
            int j = i;
            while(j<s.length()-1 && !chars.containsKey(s.charAt(j+1))){
                chars.put(s.charAt(j+1), 1);
                currentSubStringLength++;
                j++;
            }

            if(currentSubStringLength>longestSubString){
                longestSubString = currentSubStringLength;
            }

        }

        return longestSubString;
        
    }
}
