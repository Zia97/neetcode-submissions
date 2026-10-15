class Solution {
    public int characterReplacement(String s, int k) {

        int l = 0;
        int maxF = 0;
        int res = 0;

        HashMap<Character,Integer> charCountMap = new HashMap();
        for (int r=0; r<s.length(); r++){
            char c = s.charAt(r);

            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            maxF = Math.max(maxF, charCountMap.get(c));

            while ((r-l+1) - maxF > k){
                charCountMap.put(s.charAt(l), charCountMap.get(s.charAt(l)) - 1);
                l++;
            }

            res = Math.max(res, r-l+1);
            
        }

        return res;
        
    }
}
