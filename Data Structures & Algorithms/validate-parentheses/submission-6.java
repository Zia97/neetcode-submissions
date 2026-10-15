class Solution {
    public boolean isValid(String s) {

        HashMap<Character,Character> closedToOpen = new HashMap();
        closedToOpen.put(')', '(');
        closedToOpen.put('}', '{');
        closedToOpen.put(']', '[');
        
        Stack<Character> stack = new Stack();
        
        for (int i=0; i<s.length(); i++){

            Character c = s.charAt(i);

            if(!closedToOpen.containsKey(c)){
                stack.push(c);
            }else{
                
                if(stack.isEmpty()){
                    return false;
                }

                if(stack.peek()!=closedToOpen.get(c)){
                    return false;
                }else{
                    stack.pop();
                }
            }

        }
        return stack.isEmpty() ? true : false;
        
    }
}
