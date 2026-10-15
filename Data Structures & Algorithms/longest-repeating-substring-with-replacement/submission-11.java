class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> charAndCount = new HashMap();

        int l = 0;
        int maxF = 0;
        int longestString = 0; 

        for (int r=0; r<s.length(); r++){

            Character c = s.charAt(r);

            charAndCount.put(c, charAndCount.getOrDefault(c, 0) + 1);

            maxF = Math.max(maxF, charAndCount.get(c));

            while((r-l + 1) - maxF > k){
                charAndCount.put(s.charAt(l), charAndCount.get(s.charAt(l))-1);
                l++;
            }

            longestString = r-l+1;

        }

        return longestString;
        
    }
}
