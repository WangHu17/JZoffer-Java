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
//输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点。
public class Solution {
    
    private TreeNode pre = null;
    private TreeNode root = null;
    
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null)return null;
        Convert(pRootOfTree.left);
        if(root == null)root = pRootOfTree;
        if(pre != null){
            pRootOfTree.left = pre;
            pre.right = pRootOfTree;
        }
        pre = pRootOfTree;
        Convert(pRootOfTree.right);
        return root;
    }
}