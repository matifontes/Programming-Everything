/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode a=head;

        ListNode a1=l1;
        ListNode a2=l2;
        while(a1!=null && a2!=null){
            if(a1.val < a2.val){
                a.next = a1;
                a1 = a1.next;
            }else{
                a.next = a2;
                a2 = a2.next;
            }
            a=a.next;
        }

        if(a1!=null){
            a.next = a1;
        }

        if(a2!=null){
            a.next = a2;
        }

        return head.next;
    }
}
