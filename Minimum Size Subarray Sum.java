class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n=arr.length;
        int i=0,j=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        while(j<n){
       
          sum+=arr[j];
          if(sum>=target){
            
            while(sum>=target)
            {
             if(min>j-i+1)
               min=j-i+1;
              sum-=arr[i++];
            }
            
          }
           j++;
        }
         
        if(sum<target&&min==Integer.MAX_VALUE) return 0;
       return min;
    }

}
