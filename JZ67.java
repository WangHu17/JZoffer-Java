import java.util.*;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 
     * @param s string字符串 
     * @return int整型
     */
    public int StrToInt (String s) {
        s = s.trim();
        int len = s.length();
        if(len == 0)return 0;
        int flag = 1;
        if(s.charAt(0) == '-')flag = -1;
        int i = 0;
        long res = 0;
        if(s.charAt(0) == '-' || s.charAt(0) == '+')i = 1;
        while(i < len) {
            if(Character.isDigit(s.charAt(i))) {
                res = res*10 + (s.charAt(i) - '0');
                if(flag == 1 && res > Integer.MAX_VALUE)return Integer.MAX_VALUE;
                else if(flag == -1 && -1*res < Integer.MIN_VALUE)return Integer.MIN_VALUE;
                i++;
            }else
                break;
        }
        return flag*(int)res;
    }
}