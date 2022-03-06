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
//给定一个二叉树root和一个整数值 sum ，求该树有多少路径的的节点值之和等于 sum 。
//该题路径定义不需要从根节点开始，也不需要在叶子节点结束，但是一定是从父亲节点往下到孩子节点
public class Solution {

    private int res = 0;
    
    public int FindPath (TreeNode root, int sum) {
        if(root == null)return res;
        dfs(root, sum);
        FindPath(root.left, sum);
        FindPath(root.right, sum);
        return res;
    }
    
    public void dfs(TreeNode root, int sum) {
        if(root == null)return;
        sum -= root.val;
        if(sum == 0)res++;
        dfs(root.left, sum);
        dfs(root.right, sum);
    }
    
}