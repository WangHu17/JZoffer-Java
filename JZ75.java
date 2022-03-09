import java.util.*;

public class Solution {
    
    private Queue<Character> queue = new LinkedList<>();
    private HashMap<Character,Integer> map = new HashMap<>();
    
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(map.get(ch)==null)queue.offer(ch);
        map.put(ch, map.getOrDefault(ch,0)+1);
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        while(!queue.isEmpty()){
            char ch = queue.peek();
            if(map.get(ch)==1)return ch;
            else queue.poll();
        }
        return '#';
    }
}