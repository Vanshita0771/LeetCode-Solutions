class Solution {
    public ListNode sortList(ListNode head) {
       ListNode ptr=head;
       ArrayList<Integer> arr=new ArrayList<>();
       while(ptr!=null){
           arr.add(ptr.val);
           ptr=ptr.next;
       } 
       Collections.sort(arr);
       ptr=head;
       int j=0;
        while(ptr!=null){
           ptr.val=arr.get(j++);
           ptr=ptr.next;
       } 
       return head;
    }
}
