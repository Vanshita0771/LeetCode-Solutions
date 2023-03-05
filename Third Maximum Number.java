class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(Integer i:set){
            arr.add(i);
        }
        if(arr.size()<3)
         return arr.get(arr.size()-1);
        return arr.get(arr.size()-3);
    }
}
