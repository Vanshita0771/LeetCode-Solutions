class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int i=0,j=height.length-1;
         while(i<j){
                 int ar=Math.min(height[i],height[j])*(j-i);
                 if(ar>max)
                  max=ar;
                 if(height[i]>height[j])
                  j--;
                  else
                   i++;
            

         }
        return max;
    }
}