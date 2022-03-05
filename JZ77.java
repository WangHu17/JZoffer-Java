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
public class Solution {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(pRoot==null)return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pRoot);
        int level = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            while(size-- > 0){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null)queue.offer(node.left);
                if(node.right != null)queue.offer(node.right);
            }
            level++;
            if(level%2==0)Collections.reverse(list);
            res.add(list);
        }
        return res;
    }

}