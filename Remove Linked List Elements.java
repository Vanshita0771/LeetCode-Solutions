
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr=head;
        ListNode prev=null;//initialised the prev to null in beginning

        while(curr!=null){
            if(curr.val==val)
            {
                if(curr==head){
                    head=head.next;
                }
                else{//handling both cases when curr node is in middle and last
                    prev.next=curr.next;
                    curr=prev;// as we deleted curr node so curr would point to prev
                }
            }
            prev=curr;
            curr=curr.next;
        }
        return head;
    }
}
