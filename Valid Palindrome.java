class Solution {
    public boolean isPalindrome(String s) {
       String st="";
       s=s.toLowerCase();
       for(int i=0;i<s.length();i++){
           Character ch=s.charAt(i);
          
             if(ch>='a'&&ch<='z')
             st+=ch;
            if(ch>='0'&&ch<='9')
             st+=ch;
       }  
      // System.out.print(st);
        int i=0,j=st.length()-1;
	  boolean isPalindrome=true;
	  while(i<=j){
	      if(st.charAt(i)!=st.charAt(j))
	       {
	           return false;
	          
	       }
	       i++;
	       j--;
	  }
	  return true;
    }
}
