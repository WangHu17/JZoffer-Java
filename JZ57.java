import java.util.*;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        //方法一：使用HashSet
//         HashSet<Integer> set = new HashSet<>();
//         for(int n:array)set.add(sum-n);
//         ArrayList<Integer> res = new ArrayList<>();
//         for(int n:array){
//             if(set.contains(n)){
//                 res.add(n);
//                 res.add(sum-n);
//                 break;
//             }
//         }
//         return res;
        //方法二：双指针
        ArrayList<Integer> res = new ArrayList<>();
        int l = 0, r = array.length - 1;
        while(l < r){
            if(array[l] + array[r] == sum){
                res.add(array[l]);
                res.add(array[r]);
                break;
            } else if(array[l] + array[r] < sum)
                l++;
            else
                r--;
        }
        return res;
    }
}