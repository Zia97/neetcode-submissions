class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack();
        Map<Character,Character> closeOpenPair = new HashMap();
        closeOpenPair.put(')', '(');
        closeOpenPair.put('}', '{');
        closeOpenPair.put(']', '[');

        char[] charArray = s.toCharArray();

        for(char c : charArray){
            
            if(closeOpenPair.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == closeOpenPair.get(c)){
                    stack.pop();
                }else{
                    return false;
                }

            }else{
                stack.push(c);
            }

        }

        if(!stack.isEmpty()){
            return false;
        }

        return true;
        
    }
}
