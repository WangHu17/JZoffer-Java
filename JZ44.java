import java.util.*;

//数字以 0123456789101112131415... 的格式作为一个字符序列，在这个序列中第 2 位（从下标 0 开始计算）是 2 ，第 10 位是 1 ，第 13 位是 1 ，以此类题，请你输出第 n 位对应的数字。
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param n int整型 
     * @return int整型
     */
    public int findNthDigit (int n) {
        int digitCount = 1;
        long start = 1, count = 9;
        while(n > count){
            n -= count;
            digitCount++;
            start *= 10;
            count = digitCount*start*9;
        }
        long num = start + (n-1)/digitCount;
        int r = (n-1)%digitCount;
        return Long.toString(num).charAt(r) - '0';
    }
}