public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode auxA = headA;
        while (auxA != null){
            ListNode auxB = headB;
            while(auxB != null){
                if(auxA == auxB){
                    return auxA;
                }else{
                    auxB=auxB.next;
                }
            }
            auxA=auxA.next;
        }
        return null;
    }
}
