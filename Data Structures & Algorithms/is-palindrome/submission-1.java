class Solution {
    public boolean isPalindrome(String s) {
        String sLowerCase = s.toLowerCase();

        int frontCounter = 0;
        int backCounter = sLowerCase.length()-1;

        while(frontCounter<backCounter){

            while(frontCounter<backCounter && !isAlphaNumeric(sLowerCase.charAt(frontCounter))){
                frontCounter++;
            }

             while(backCounter>frontCounter && !isAlphaNumeric(sLowerCase.charAt(backCounter))){
                backCounter--;
            }

            if(sLowerCase.charAt(frontCounter) != sLowerCase.charAt(backCounter)){
                return false;
            }

            frontCounter++;
            backCounter--;
        }

        return true;
    }

    public boolean isAlphaNumeric(char c){
        return Character.isDigit(c) || Character.isLetter(c);
    }
}
