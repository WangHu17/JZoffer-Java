import java.util.*;
import java.lang.Math;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param n int整型 最大位数
     * @return int整型一维数组
     */
    public int[] printNumbers (int n) {
        // write code here
        int max = (int)Math.pow(10,n);
        int[] res = new int[max-1];
        for(int i=0; i<max-1; i++)res[i] = i+1;
        return res;
    }
}