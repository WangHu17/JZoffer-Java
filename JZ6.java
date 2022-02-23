/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
import java.util.Collections;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        ListNode p = listNode;
//         while( p != null ){
//             res.add(0, p.val);
//             p = p.next;
//         }
        while( p != null ){
            res.add(p.val);
            p = p.next;
        }
        Collections.reverse(res);
        return res;
    }
}