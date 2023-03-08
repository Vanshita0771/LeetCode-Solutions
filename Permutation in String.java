class Solution {
    public boolean checkInclusion(String pat, String txt) {
         HashMap<Character,Integer> pHash=new HashMap<>();
       HashMap<Character,Integer> tHash=new HashMap<>();
        for(int i=0;i<pat.length();i++)
         {
             if(pHash.containsKey(pat.charAt(i))){
                 pHash.put(pat.charAt(i),pHash.get(pat.charAt(i))+1);
             }
             else
              pHash.put(pat.charAt(i),1);
         }
         int ans=0;
         if(pat.length()>txt.length()) return false;
         for(int i=0;i<pat.length();i++){
               if(tHash.containsKey(txt.charAt(i))){
                 tHash.put(txt.charAt(i),tHash.get(txt.charAt(i))+1);
             }
             else
              tHash.put(txt.charAt(i),1);
         
    }
     if(pHash.equals(tHash))
          return true;
    int i=0;
    for(int j=pat.length();j<txt.length();j++){
        
        if(tHash.get(txt.charAt(i))>1)
          tHash.put(txt.charAt(i),tHash.get(txt.charAt(i))-1);
         else
         tHash.remove(txt.charAt(i));
        i++;
        
        if(tHash.containsKey(txt.charAt(j)))
            tHash.put(txt.charAt(j),tHash.get(txt.charAt(j))+1);
         else
            tHash.put(txt.charAt(j),1);
         if(pHash.equals(tHash))
          return true;
    }
    return false;
    }
}
