/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
//输入两棵二叉树A，B，判断B是不是A的子结构。（我们约定空树不是任意一个树的子结构）
public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null)return false;
        if(dfs(root1, root2))return true;
        return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }
    
    public boolean dfs(TreeNode root1,TreeNode root2) {
        if(root2 == null)return true;
        if(root1 == null)return false;
        if(root1.val != root2.val)return false;
        return dfs(root1.left, root2.left) && dfs(root1.right, root2.right);
    }
}