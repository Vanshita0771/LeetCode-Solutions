class Solution {
    public int removeDuplicates(int[] nums) {
       
       TreeSet<Integer> set=new TreeSet<>();
       for(int i=0;i<nums.length;i++)
        set.add(nums[i]);
        int k=0;
        for(Integer i:set)
           nums[k++]=i;
         return set.size();
    }
}
