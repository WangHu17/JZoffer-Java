import java.util.*;


public class Solution {
    /**
     * 
     * @param prices int整型一维数组 
     * @return int整型
     */
    public int maxProfit (int[] prices) {
        // write code here
        int minPrice = prices[0], max = 0;
        for(int price:prices){
            if(price < minPrice)minPrice = price;
            if(price - minPrice > max)max = price - minPrice;
        }
        return max;
    }
}