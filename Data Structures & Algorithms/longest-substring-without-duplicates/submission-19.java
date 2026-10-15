class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length()==0){
            return 0;
        }

        int l = 0;
        int longestSubString = 0;

        HashMap<Character,Integer> charAndPos = new HashMap();


        for(int r=0; r<s.length(); r++){

            char c = s.charAt(r);

            if(charAndPos.containsKey(c)){
                l = Math.max(charAndPos.get(c) + 1, l);   // don't move back further than we have left pointer or we can add new issues again 
            }

            charAndPos.put(c, r);

            longestSubString = Math.max(longestSubString, r-l+1);

        }

        return longestSubString;

    }
}
