class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr=new int[2];
        int i;
        for(i=0;i<nums.length;i++)
         {
             if(nums[i]==target)
              {
                  arr[0]=i;
                  break;
              }
         }
         if(i==nums.length)
         {
             arr[0]=-1;
             arr[1]=-1;
             return arr;
         }
          for(i=nums.length-1;i>-1;i--)
         {
             if(nums[i]==target)
              {
                  arr[1]=i;
                  break;
              }
         }
         return arr;
    }
}
