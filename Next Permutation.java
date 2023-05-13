class Solution {
  
    public void nextPermutation(int[] nums) {
        boolean flag=false;
        int i;
        for( i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                flag=true;
                break;
            }

        }
        if(flag){
            int j;
           for( j=nums.length-1;j>=i;j--){
               if(nums[i-1]<nums[j])
                 break;
           }
       
           int temp=nums[i-1];
           nums[i-1]=nums[j];
           nums[j]=temp;
           Arrays.sort(nums,i,nums.length);
           return;
        }
        Arrays.sort(nums);
        
    }
}
