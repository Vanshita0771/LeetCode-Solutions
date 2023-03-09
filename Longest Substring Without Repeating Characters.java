class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0,end=0;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(end<s.length()){
            if(map.containsKey(s.charAt(end))){
                if(end-start>max)
                 max=end-start;
                Character ch=s.charAt(end);
                while(s.charAt(start)!=ch){
                    map.remove(s.charAt(start));
                    start++;
                }   
                 start++;
            }
            map.put(s.charAt(end),1);
            end++;
        }
        if(end-start>max)
         return end-start;
        return max;
    }
}
