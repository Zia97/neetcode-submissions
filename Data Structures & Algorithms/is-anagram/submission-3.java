class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        Map<Character, Integer> charAndCountS = new HashMap();
        Map<Character, Integer> charAndCountT = new HashMap();

        for(int i=0; i<=s.length()-1; i++){
            charAndCountS.put(s.charAt(i), charAndCountS.getOrDefault(s.charAt(i), 0) + 1);
            charAndCountT.put(t.charAt(i), charAndCountT.getOrDefault(t.charAt(i), 0) + 1);
        }

        return charAndCountS.equals(charAndCountT);

    }
}
