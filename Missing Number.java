class Solution {
    public int missingNumber(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++)
        map.put(nums[i],1);
      for(int i=0;i<nums.length;i++)
       {
           if(!map.containsKey(i))
            return i;
       }  
       return nums.length;
    }
}
