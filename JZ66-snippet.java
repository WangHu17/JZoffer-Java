import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int len = A.length;
        int[] res = new int[len];
        for(int i = 0;i < len; i++){
            int sum=1;
            for(int j = 0; j < len; j++){
                if(j == i)continue;
                sum *= A[j];
            }
            res[i] = sum;
        }
        return res;
    }
}