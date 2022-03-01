import java.util.Stack;

public class Solution {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> min = new Stack<>();
    
    public void push(int node) {
        stack.push(node);
        if(min.isEmpty() || min.peek() >= node)min.push(node);
    }
    
    public void pop() {
        if(stack.peek().equals(min.peek())){
            stack.pop();
            min.pop();
        }else
            stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return min.peek();
    }
}