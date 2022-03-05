//输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
public class Solution {
    
    public boolean VerifySquenceOfBST(int [] sequence) {
        int len = sequence.length;
        if(len == 0)return false;
        return check(sequence, 0, len - 1);
    }
    
    public boolean check(int[] seq, int l, int r) {
        if(l >= r)return true;
        int root = seq[r];
        int j = r - 1;
        while(j >= 0 && seq[j] > root)j--;
        for(int i=0; i<=j; i++){
            if(seq[i] > root)return false;
        }
        return check(seq, l, j) && check(seq, j+1, r-1);
    }
}