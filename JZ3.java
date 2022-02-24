import java.util.*;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param numbers int整型一维数组 
     * @return int整型
     */
    public int duplicate (int[] numbers) {
        // write code here
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]==numbers[i+1])return numbers[i];
        }
//         Set<Integer> set = new HashSet<>();
//         for(int n:numbers){
//             if(!set.add(n))return n;
//         }
        return -1;
    }
}