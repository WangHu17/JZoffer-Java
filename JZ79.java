import java.lang.Math;
public class Solution {
    
    private boolean flag = true;
    
    public boolean IsBalanced_Solution(TreeNode root) {
        IsBalanced(root);
        return flag;
    }
    
    public int IsBalanced(TreeNode root){
        if(root == null)return 0;
        int l = IsBalanced(root.left);
        int r = IsBalanced(root.right);
        if(Math.abs(l-r)>1)flag=false;
        return Math.max(l,r)+1;
    }
}