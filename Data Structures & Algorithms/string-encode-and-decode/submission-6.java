class Solution {

    public String encode(List<String> strs) {

        StringBuilder encodedString = new StringBuilder();

        for(String str: strs){
            int strLength = str.length();
            String encodedStr = strLength+"#"+str;
            encodedString.append(encodedStr);
        }

        return encodedString.toString();

    }

    public List<String> decode(String str) {

        List<String> decodedStrings = new ArrayList();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                sb.append(str.charAt(i));
            }else{
                Integer strLength = Integer.parseInt(sb.toString());
                String stringToAdd = str.substring(i+1, i+strLength+1);
                decodedStrings.add(stringToAdd);
                i = i+strLength;
                sb = new StringBuilder();
            }
        
        }

        return decodedStrings;

    }
}
