class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> charAndCount = new HashMap();
        Integer strLen = Integer.MAX_VALUE;
        String smallestString = "";

        char[] charArray = t.toCharArray();

        for (char c : charArray) {
            charAndCount.put(c, charAndCount.getOrDefault(c, 0) + 1);
        }

        if (t.length() > s.length() || t.length() == 0) {
            return "";
        }

        int l = 0;

        HashMap<Character, Integer> map = new HashMap();

        int required = charAndCount.size();
        int have = 0;

        for (int r = 0; r < s.length(); r++) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);

            if (charAndCount.containsKey(s.charAt(r))
                && map.get(s.charAt(r)) == charAndCount.get(s.charAt(r))) {
                have++;
            }

            if (have == required) {
                while (have == required) {
                    int thisStrLen = r - l +1;

                    if (r - l + 1 < strLen) {
                        strLen = r - l + 1;
                        smallestString = s.substring(l, r + 1);
                    }
                    Character c = s.charAt(l);
                    map.put(c, map.get(c) - 1);

                    if (charAndCount.containsKey(c) && map.get(c) < charAndCount.get(c)) {
                        have--;
                    }

                    l++;
                }
            }
        }

        return smallestString;
    }
}
