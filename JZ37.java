import java.util.*;
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
//序列化二叉树
public class Solution {
    String Serialize(TreeNode root) {
        if(root == null)return null;
        StringBuilder builder = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node != null){
                builder.append(node.val + ",");
                queue.add(node.left);
                queue.add(node.right);
            }
            else builder.append("#,");
        }
        return builder.toString();
    }
    
    TreeNode Deserialize(String str) {
        if(str == null || str == "")return null;
        Queue<TreeNode> queue = new LinkedList<>();
        String[] strs = str.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(strs[0]));
        queue.add(root);
        for(int i=1; i<strs.length-1; i+=2){
            TreeNode node = queue.poll();
            String l = strs[i];
            String r = strs[i+1];
            if(!"#".equals(l)){
                node.left = new TreeNode(Integer.parseInt(l));
                queue.add(node.left);
            }
            if(!"#".equals(r)){
                node.right = new TreeNode(Integer.parseInt(r));
                queue.add(node.right);
            }
        }
        return root;
    }
}