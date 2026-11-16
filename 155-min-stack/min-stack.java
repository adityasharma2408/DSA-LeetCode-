class MinStack {

        Stack <Integer> s,min;
    public MinStack() {
        s=new Stack<>();
        min=new Stack<>();
    }
    
    public void push(int value) {
        s.push(value);
        if(min.size()==0){
            min.push(value);
        }
        else {
        int mini=Math.min(value,min.peek());
        min.push(mini);
    }
    }
    public void pop() {
        s.pop();
        min.pop();
    }
    
    public int top() {
        return s.peek();        
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */