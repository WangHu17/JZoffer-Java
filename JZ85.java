import java.util.*;

//连续子数组的最大和(二)
public class Solution {
    public int[] FindGreatestSumOfSubArray (int[] array) {
        if(array.length<=1)return array;
        int left = 0, right = 0, maxLeft = 0, maxRight = 0, sum = array[0], max = array[0];
        for(int i=1; i<array.length; i++){
            right++;
            sum += array[i];
            if(sum < array[i]){
                left = right;
                sum = array[i];
            }
            if(max < sum || max == sum && (right- left + 1)>(maxRight-maxLeft+1)){
                max = sum;
                maxRight = right;
                maxLeft = left;
            }
        }
        int[] res = new int[maxRight-maxLeft+1];
        int k = 0;
        for(int i=maxLeft; i<=maxRight; i++)
            res[k++] = array[i]; 
        return res;
    }
}