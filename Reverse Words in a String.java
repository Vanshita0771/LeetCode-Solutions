class Solution {
    public String reverseWords(String s) {
        String word="";
        Stack<String> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(word.length()!=0){
                 st.push(word);
                 word="";
                }
            }
            else{
                word+=s.charAt(i);
            }
        }
         if(word.length()!=0){
            st.push(word);
        }
        String ans="";
        while(st.size()!=0){
            ans+=st.pop();
            if(st.size()!=0)
            ans+=" ";
        }
        return ans;
    }
}
