import java.util.*;
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//给定节点数为 n 的二叉树的前序遍历和中序遍历结果，请重建出该二叉树并返回它的头结点。
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre, int [] vin) {
        return construct(pre, vin, 0, 0, vin.length-1);
    }
    
    public TreeNode construct(int [] pre, int [] in, int preIndex, int inLeft, int inRight){
        if(preIndex > pre.length - 1 || inLeft > inRight)return null;
        TreeNode node = new TreeNode(pre[preIndex]);
        int index = 0;
        for(int i=inLeft; i<=inRight; i++){
            if(in[i] == node.val){
                index = i;
                break;
            }
        }
        node.left = construct(pre, in, preIndex + 1, inLeft, index - 1);
        node.right = construct(pre, in, preIndex + index - inLeft + 1, index + 1, inRight);
        return node;
    }
}