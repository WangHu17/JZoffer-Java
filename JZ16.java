//数值的整数次方
public class Solution {
    public double Power(double base, int exponent) {
        if(exponent < 0){
            base = 1/base;
            exponent *= -1;
        }
        return power(base, exponent);
    }
    
    public double power(double base, int exponent){
        if(exponent == 0)return 1.00;
        double res = power(base, exponent/2);
        if(exponent%2 == 1)
            return res*res*base;
        else
            return res*res;
    }
}