class Solution {
    public boolean isPalindrome(String s) {

        int l=0;

        s = s.replaceAll("[^A-Za-z0-9]", "");

        s = s.toLowerCase();

        int r = s.length()-1;

        System.out.println("test"+s);

        while(l<r){
            Character leftChar = s.charAt(l);
            Character rightChar = s.charAt(r);
            if(leftChar!=rightChar){
                return false;
            }
            l++;
            r--;
        }
        return true;
        
    }
}
