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
     public int size(ListNode head){
        ListNode ptr=head;
        int count=0;
        while(ptr!=null){
            count++;
            ptr=ptr.next;
        }
        return count;
    }
    public ListNode deleteMiddle(ListNode head) {
         int count=size(head);
         int pos=count/2;
        ListNode ptr=head;
        if(head==null) return null;
        if(count==1)
         return null;
        int val=0;
        while(val<pos-1){
            ptr=ptr.next;
            val++;
        }
        ptr.next=ptr.next.next;
         return head;
    }
   
}
