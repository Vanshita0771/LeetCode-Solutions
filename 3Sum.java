class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(i!=0&&nums[i]==nums[i-1])
             continue;
             int j=i+1,k=n-1;
             while(j<k){
                 if(nums[j]+nums[k]+nums[i]==0){
                     List<Integer> r=new ArrayList<>();
                     r.add(nums[i]);
                     r.add(nums[j]);
                     r.add(nums[k]);
                     
                     ans.add(r);
                     while(j<k&&nums[j]==nums[j+1])
                        j++;
                    while(j<k&&nums[k]==nums[k-1])
                     k--;
                     j++;
                     k--;
                 }
                 else if(nums[i]+nums[j]+nums[k]>0){
                     k--;
                 }
                 else
                   j++;
             }
        }
        return ans;

    }
}
