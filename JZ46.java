import java.util.*;

//有一种将字母编码成数字的方式：'a'->1, 'b->2', ... , 'z->26'。
//现在给一串数字，返回有多少种可能的译码结果
public class Solution {

    public int solve (String nums) {
        int len = nums.length();
        if(len == 0 || nums.charAt(0) == '0')return 0;
        int[] res = new int[len];
        res[0] = 1;
        for(int i=1; i<len; i++){
            if(nums.charAt(i) != '0')
                res[i] = res[i-1];
            int sum = (nums.charAt(i-1) - '0')*10 + (nums.charAt(i) - '0');
            if(sum >= 10 && sum <= 26){
                if(i==1)res[i]++;
                else res[i] += res[i-2];
            }
        }
        return res[len - 1];
    }
    
}