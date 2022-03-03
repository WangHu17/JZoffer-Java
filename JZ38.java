import java.util.*;
public class Solution {
    
    //字符串的全排列
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if(str.length()==0)return res;
        HashSet<String> set = new HashSet<>();
        permutate(0,str,set);
        for(String s:set)res.add(s);
        return res;
    }
    
    public void permutate(int pos, String str, HashSet<String> set) {
        if(pos == str.length() - 1){
            set.add(str);
            return;
        }
        for(int i=pos; i<str.length(); i++){
            str = swap(str, pos, i);
            permutate(pos + 1, str, set);
            str = swap(str, i, pos);
        }
    }
    
    public String swap(String s,int a,int b){
        StringBuffer sb = new StringBuffer(s);
        char temp = sb.charAt(a);
        sb.setCharAt(a,sb.charAt(b));
        sb.setCharAt(b,temp);
        return sb.toString();
    }

}