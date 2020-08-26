class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode aux = head;
        ListNode p = head;
        int length =0;
        while(aux.next != null){
            length++;
            aux=aux.next;
        }
        
        int midAux=0;
        
        if(length % 2 == 0){
            length=length/2;
        }else{
            length=length/2 +1;
        }
        
        for(int i=0; i<length; i++){
            p = p.next;
        }
        
        return p;
    }
}
