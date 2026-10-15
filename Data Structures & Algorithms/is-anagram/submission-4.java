class Solution {
    public boolean isAnagram(String s, String t) {
        char[] firstString = s.toCharArray();
        char[] secondString = t.toCharArray();

        Arrays.sort(firstString);
        Arrays.sort(secondString);

        if(firstString.length!=secondString.length){
            return false;
        }

        int length = firstString.length;
        int i=0; 

        while(i<length){
            if(firstString[i]!=secondString[i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
