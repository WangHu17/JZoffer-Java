import java.util.*;

//一个整型数组里除了两个数字只出现一次，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
public class Solution {

    public int[] FindNumsAppearOnce (int[] array) {
        Set<Integer> set = new HashSet<>();
        for(int n:array){
            if(!set.add(n))set.remove(n);
        }
        int[] res = new int[2];
        int i=0;
        for(int n:set)res[i++]=n;
        return res;
    }
    
}