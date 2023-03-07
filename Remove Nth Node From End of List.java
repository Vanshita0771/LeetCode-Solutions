
class Solution {
    public int size(ListNode head){
        ListNode ptr=head;
        int count=0;
        while(ptr!=null){
            count++;
            ptr=ptr.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=size(head);
        int pos=count-n+1;
        ListNode ptr=head;
        if(head==null) return null;
        if(pos==1){
           head=head.next;
           
        }
        else{
            
            while(pos-2>0){
                ptr=ptr.next;
                pos--;
            }
            ptr.next=ptr.next.next;

        }
        return head;
    }
}
