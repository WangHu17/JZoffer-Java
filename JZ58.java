public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str.length() <= 1)return str;
        n = n%str.length();
        String res = "";
        res += str.substring(n);
        res += str.substring(0,n);
        return res;
    }
}