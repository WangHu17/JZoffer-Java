import java.util.*;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        String[] s = new String[numbers.length];
        for(int i=0;i<numbers.length;i++)s[i]=numbers[i]+"";
        Arrays.sort(s,(a, b)-> {
            return Integer.parseInt(a + b) - Integer.parseInt(b + a);
        });
        String res = "";
        for(String n:s)res += n;
        return res;
    }
}