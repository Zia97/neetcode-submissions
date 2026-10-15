class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> charAndPos = new HashMap();
         
         int l = 0;
         int r = 0;

         int longestSubString = 0;

         for (int i=0; i<s.length(); i++){

            Character c = s.charAt(i);

            if(charAndPos.containsKey(c)){
                r++;
                l = Math.max(l, charAndPos.get(c)+1);
                charAndPos.put(c, i);
            }else{
                charAndPos.put(c, i);
                r++;
            }
                            longestSubString = Math.max(r-l, longestSubString);
         }

         return longestSubString;
    }
}
