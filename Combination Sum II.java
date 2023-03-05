class Solution {
     List<List<Integer>> result=new ArrayList<>();
    public void solve(int  ind,int target,List<Integer> list,int[] candidate){
       
            if(target==0){
              
               result.add(new ArrayList<>(list));
               return;
            }
            for(int i=ind;i<candidate.length;i++){
                if(i>ind&&candidate[i]==candidate[i-1])
                 continue;
                if(target-candidate[i]>=0){
                   list.add(candidate[i]);
                   solve(i+1,target-candidate[i],list,candidate);
                   list.remove(list.size()-1);
                }
            }
            
            
    }
    public List<List<Integer>> combinationSum2(int[] candidate, int target) {
         List<Integer> list=new ArrayList<>();
        Arrays.sort(candidate);
        solve(0,target,list,candidate);
        return result;
    }
}
