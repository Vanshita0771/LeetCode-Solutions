class Solution {
    public int reverse(int x) {
        if(x>Integer.MAX_VALUE||x<Integer.MIN_VALUE)
         return 0;
        int temp=Math.abs(x);
        double rev=0;
        while(temp>0){
            rev=rev*10+temp%10;
             
            temp/=10;
        }
       
        if(x<0)
             rev=-rev;
          if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE)
                return 0; 
          return (int)rev;
        
    }
}
