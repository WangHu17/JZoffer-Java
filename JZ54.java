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

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param proot TreeNode类 
     * @param k int整型 
     * @return int整型
     */
    private int count = 0;
    private int res = -1;
    
    public int KthNode (TreeNode proot, int k) {
        // write code here
        if(proot == null)return -1;
        KthNode(proot.left, k);
        count++;
        if(count == k)return res = proot.val;
        KthNode(proot.right, k);
        return res;
    }
}