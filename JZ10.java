public class Solution {
    public int Fibonacci(int n) {
        if(n < 3)return 1;
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}