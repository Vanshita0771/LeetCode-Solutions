class Solution {
    public int removeElement(int[] nums, int val) {
        int[] arr=new int[nums.length];
        int k=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=val){
             arr[k++]=nums[i];
             count++;
           }
        }
        for(int i=0;i<nums.length;i++)
         nums[i]=arr[i];
        return count;
    }
}
