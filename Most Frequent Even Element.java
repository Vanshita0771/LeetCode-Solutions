class Solution {
    public int mostFrequentEven(int[] nums) {
         TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
             map.put(nums[i],map.get(nums[i])+1);
            else
             map.put(nums[i],1);
        }
        int max=-1;
        int val=-1;
        for(Integer key:map.keySet()){
            if(map.get(key)>max&&key%2==0){
             max=map.get(key);
             val=key;
            }
        }
        return val;
    }
}
