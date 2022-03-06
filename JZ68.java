import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 *   public TreeNode(int val) {
 *     this.val = val;
 *   }
 * }
 */
// 二叉搜索树的最近公共祖先
public class Solution {

    public int lowestCommonAncestor (TreeNode root, int p, int q) {
        if((p<=root.val && q>=root.val)||(q<=root.val && p>=root.val))return root.val;
        if(p<root.val)return lowestCommonAncestor(root.left, p ,q);
        else return lowestCommonAncestor(root.right, p ,q);
    }
}