class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int count=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                i++;
            }
            else if(nums1[i]>nums2[j])
            {
                j++;
            }
            else // both equal
            {
                  count++;
             
                i++;
                j++;
            
            }
          }
          i=0;
          j=0;
          k=0;
          int nums[]=new int[count];
          while(i<nums1.length && j<nums2.length)
            {
            if(nums1[i]<nums2[j])
            {
                i++;
            }
            else if(nums1[i]>nums2[j])
            {
                j++;
            }
            else // both equal
            {
                 
                nums[k]=nums1[i];
                k++;
                i++;
                j++;
            
            }
          }
         return nums;
    }
}
  
