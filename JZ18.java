import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 *   public ListNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param head ListNode类 
     * @param val int整型 
     * @return ListNode类
     */
    public ListNode deleteNode (ListNode head, int val) {
        // write code here
        ListNode p = head;
        if(head.val == val){
            head = head.next;
            return head;
        }
        while(p != null){
            if(p.next.val == val){
                p.next = p.next.next;
                return head;
            }
            p = p.next;
        }
        return head;
    }
}