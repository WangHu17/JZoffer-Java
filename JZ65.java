// 不用加减乘除做加法
public class Solution {
    public int Add(int a,int b) {
        if(a == 0 || b == 0)return a^b;
        return Add(a^b, (a&b)<<1);
    }
}