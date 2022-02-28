/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    boolean isSymmetrical(TreeNode pRoot) {
        return isMirror(pRoot, pRoot);
    }
    
    public boolean isMirror(TreeNode p1, TreeNode p2){
        if(p1==null && p2==null)return true;
        if(p1==null || p2==null)return false;
        if(p1.val != p2.val)return false;
        return isMirror(p1.left, p2.right) && isMirror(p1.right, p2.left);
    }
}