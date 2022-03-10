import java.util.*;

//请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
public class Solution {
    
    public int lengthOfLongestSubstring (String s) {
        int[] map = new int[128];
        Arrays.fill(map, -1);
        int max = 0, cur = 0;
        for(int j=0; j<s.length(); j++){
            int index = s.charAt(j) - ' ';
            int i = map[index]==-1?-1:map[index];
            map[index] = j;
            cur = cur < (j-i)?(cur+1):(j-i);
            max = Math.max(max,cur);
        }
        return max;
    }
    
}