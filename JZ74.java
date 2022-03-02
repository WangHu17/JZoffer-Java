import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int l = 1, r = 1, cur = 0;
        while(l <= sum/2) {
            if(cur < sum){
                cur += r;
                r++;
            }else if(cur > sum){
                cur -= l;
                l++;
            }else{
                ArrayList<Integer> list = new ArrayList<>();
                for(int i=l; i<r; i++)list.add(i);
                res.add(list);
                cur -= l;
                l++;
            }
        }
        return res;
    }
}