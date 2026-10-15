class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int maxf = 0;
        int res = 0;
        HashMap<Character, Integer> characterAndFreq = new HashMap();

        // res - maxf <= k

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            characterAndFreq.put(c, characterAndFreq.getOrDefault(c, 0) + 1);

            maxf = Math.max(maxf, characterAndFreq.get(c));

            while ((r - l + 1) - maxf > k) {
                characterAndFreq.put(s.charAt(l), characterAndFreq.get(s.charAt(l)) - 1);
                l++;
            }

            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
