class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minstack;
    public MinStack() {
        stack = new Stack();
        minstack = new Stack();
    }
    
    public void push(int val) {
        stack.push(val);
        if( minstack.isEmpty() || (val<=(int)minstack.peek()))
           minstack.push(val);
    }
    
    public void pop() {
        if(stack.peek().equals(minstack.peek()))
        {
            minstack.pop();
        }
        stack.pop();
    }
    
    public int top() {
     return (int)stack.peek();   
    }
    
    public int getMin() {
       return (int)minstack.peek();
    }
}
