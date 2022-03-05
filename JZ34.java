import java.util.*;
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
//输入一颗二叉树的根节点root和一个整数expectNumber，找出二叉树中结点值的和为expectNumber的所有路径。
public class Solution {
    
    private ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    private LinkedList<Integer> list = new LinkedList<>();
    
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int expectNumber) {
        dfs(root, expectNumber);
        return res;
    }
    
    public void dfs(TreeNode root, int sum){
        if(root==null)return;
        list.add(root.val);
        if(root.left==null && root.right==null && sum==root.val)
            res.add(new ArrayList(list));
        dfs(root.left, sum-root.val);
        dfs(root.right, sum-root.val);
        list.removeLast();
    }
}