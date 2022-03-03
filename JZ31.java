import java.util.*;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int i=0, j=0;
        while(i < pushA.length) {
            if(pushA[i] != popA[j]){
                stack.push(pushA[i++]);
            }else{
                i++; j++;
                while(!stack.isEmpty() && stack.peek()==popA[j]){
                    stack.pop();
                    j++;
                }
            }
        }
        return stack.isEmpty();
    }
}