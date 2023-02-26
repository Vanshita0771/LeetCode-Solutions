class Solution {
    public void rotate(int[] nums, int k) {
        //reverse k elements
        int n=nums.length;
        k=k%n;
        if(n==1) return;
        int i=0;
        int j=n-k-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        
        i=n-k;
        j=nums.length-1;
        if(i<-1)
         return ;
         while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        i=0;
         j=nums.length-1;
          while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
