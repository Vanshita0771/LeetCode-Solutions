class Solution {
    public void solve(int[] nums,int ind, List<List<Integer>> ans,List<Integer> list){
        if(ind==nums.length)
         return;
        
        for(int i=ind;i<nums.length;i++){
             list.add(nums[i]);
           ans.add(new ArrayList<>(list));
             solve(nums,i+1,ans,list);
               list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
         ans.add(new ArrayList<>(list));
        solve(nums,0,ans,list);
        return ans;
    }
}
