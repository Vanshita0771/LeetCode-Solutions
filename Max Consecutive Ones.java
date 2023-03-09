class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int start=0;
        int end=0;
        int max=0;
        while(end<nums.length){
            if(nums[end]==0){
                if(max<end-start)
                 max=end-start;
                end++;
                start=end;
            }
            else{
                end++;
            }
        }
         if(max<end-start)
                return end-start;
            return max;
    }
}
