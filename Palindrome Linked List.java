class Solution {
    ListNode fPtr=null;
   boolean flag=true;
    public void check(ListNode bPtr){
        if(bPtr==null){
            return;
        }
        check(bPtr.next);
     
        if(bPtr.val!=fPtr.val) 
       {
           flag=false;
           return;
       }
        
        fPtr=fPtr.next;
    }
    public boolean isPalindrome(ListNode head) {
        fPtr=head;
        ListNode bPtr=head;
        check(bPtr);
        return flag;
    }
}
