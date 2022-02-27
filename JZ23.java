/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
import java.util.*;
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode p1 = pHead;
        while(p1 != null){
            if(!set.add(p1))return p1;
            p1 = p1.next;
        }
        return null;
    }
}