import java.util.Stack;
public class Solution {
    public String ReverseSentence(String str) {
        
        Stack<String> stack = new Stack();
        String[] words = str.split(" ");
        for(String word:words)stack.push(word);
        String res = "";
        while(!stack.isEmpty()){
            res += stack.pop() + " ";
        }
        return res.trim();
    }
}