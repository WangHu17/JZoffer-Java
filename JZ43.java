public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        StringBuilder builder = new StringBuilder();
        int res = 0;
        for(int i=1;i<=n;i++)builder.append(i);
        for(int i=0;i<builder.length();i++){
            if(builder.charAt(i)=='1')res++;
        }
        return res;
    }
}