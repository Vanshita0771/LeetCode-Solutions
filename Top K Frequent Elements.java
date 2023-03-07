class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
             map.put(nums[i],map.get(nums[i])+1);
             else
              map.put(nums[i],1);
        }
        int[][] arr=new int[nums.length][2];
        int j=0;
        for(Integer i:map.keySet())
         {
             arr[j][0]=i;
             arr[j][1]=map.get(i);
             j++;
         }
         Arrays.sort(arr,(a,b)->b[1]-a[1]);
         int[] ans=new int[k];
         for(int i=0;i<k;i++){
             ans[i]=arr[i][0];
         }
         return ans;
    }
}
