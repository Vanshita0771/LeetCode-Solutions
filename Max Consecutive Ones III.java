class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0;
        int end=0;
        int max=0;
      
        while(end<nums.length){
            if(nums[end]==0){
                if(k==0){
                     System.out.print(end-start);
                    if(max<end-start){
                     max=end-start;
                    }
                    while(nums[start]!=0){
                       start++;
                   }
                    start++;
                }
                else{
                    k--;
                }
            }
            end++;
        }
        if(max<end-start){ 
            return end-start;
            }
       return max;
    }
}
