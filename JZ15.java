public class Solution {
    public int NumberOf1(int n) {
        int res = 0, m = 1;
        while(m != 0){
            if((m & n) != 0)res++;
            m <<= 1;
        }
        return res;
    }
}