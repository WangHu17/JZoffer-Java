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
import java.lang.Math;
public class Solution {
    public int TreeDepth(TreeNode root) {
        if(root == null)return 0;
        int l = TreeDepth(root.left);
        int r = TreeDepth(root.right);
        return Math.max(l,r) + 1;
    }
}