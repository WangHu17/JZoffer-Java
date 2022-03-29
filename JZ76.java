/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
//删除链表中重复的结点
public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode preHead = new ListNode(-1);
        preHead.next = pHead;
        ListNode p = preHead;
        while(p.next != null && p.next.next != null){
            if(p.next.val == p.next.next.val){
                int temp = p.next.val;
                while(p.next != null && p.next.val == temp)
                    p.next = p.next.next;
            }else
                p = p.next;
        }
        return preHead.next;
    }
}