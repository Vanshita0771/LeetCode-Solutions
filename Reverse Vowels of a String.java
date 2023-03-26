class Solution {
    public String reverseVowels(String s) {
      
         
         String st="";
         for(int i=0;i<s.length();i++){
             Character ch=s.charAt(i);
             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
              st+=ch;
             }
         }
         String ans="";
         int k=st.length()-1;
         for(int i=0;i<s.length();i++){
              Character ch=s.charAt(i);
             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
              ans+=st.charAt(k--);
             }
             else
              ans+=s.charAt(i);
         }
         return ans;
    }
}
