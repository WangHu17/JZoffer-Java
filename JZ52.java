/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1 = 0, len2 = 0;
        ListNode p1 = pHead1, p2 = pHead2;
        while(p1!=null){
            len1++;
            p1=p1.next;
        }
        while(p2!=null){
            len2++;
            p2=p2.next;
        }
        if(len1<len2){
            int c = len2-len1;
            while(c-->0){
                pHead2 = pHead2.next;
            }
        }else{
            int c = len1-len2;
            while(c-->0){
                pHead1 = pHead1.next;
            }
        }
        while(pHead1 != pHead2){
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead1;
    }
}