//我们可以用 2*1 的小矩形横着或者竖着去覆盖更大的矩形。请问用 n 个 2*1 的小矩形无重叠地覆盖一个 
//2*n 的大矩形，从同一个方向看总共有多少种不同的方法？
public class Solution {
    public int rectCover(int n) {
        if(n <= 3)return n;
        int a = 2, b = 3, c = 0;
        for(int i=4; i<=n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}