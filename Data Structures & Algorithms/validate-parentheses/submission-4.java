class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack();
        Map<Character,Character> closeToOpen = new HashMap();

        closeToOpen.put(')', '(');
        closeToOpen.put('}', '{');
        closeToOpen.put(']', '[');


        for(int i=0; i<s.length(); i++){

            char c = s.charAt(i);

            if(closeToOpen.containsKey(c) && stack.isEmpty()){
                return false;
            }
            else if(closeToOpen.containsKey(c) && !stack.isEmpty() && stack.peek().equals(closeToOpen.get(c))){
                stack.pop();
            }else{
                stack.push(c);
            }

        }

        if(stack.isEmpty()){
            return true;
        }

        return false;
        
    }
}
