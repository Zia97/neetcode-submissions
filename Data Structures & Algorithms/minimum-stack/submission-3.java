class MinStack {

    int min = Integer.MAX_VALUE;
    Stack<Integer> values = new Stack();
    Stack<Integer> minStack = new Stack();


    public MinStack() {
    }
    
    public void push(int val) {
        values.push(val);

        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
        }

  
    }
    
    public void pop() {
        int topValue = values.pop();
        if(minStack.peek()==topValue){
            minStack.pop();
        }
    }
    
    public int top() {
        int topValue = values.peek();
        return topValue;
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
