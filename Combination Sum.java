class Solution {
     List<List<Integer>> result=new ArrayList<>();
    public void solve(int  ind,int target,List<Integer> list,int[] candidate){
       
            if(target==0){
              
               result.add(new ArrayList<>(list));
               return;
            }
            if(ind==candidate.length&&target!=0)
             return;
            if(target-candidate[ind]<0)
             return;
            //not to include particular index value
            solve(ind+1,target,list,candidate);
            //to include particular index value
            list.add(candidate[ind]);
            solve(ind,target-candidate[ind],list,candidate);
            list.remove(list.size()-1);
            
            
            
    }
    public List<List<Integer>> combinationSum(int[] candidate, int target) {
       
        List<Integer> list=new ArrayList<>();
        Arrays.sort(candidate);
        solve(0,target,list,candidate);
         return result;
    }
}
