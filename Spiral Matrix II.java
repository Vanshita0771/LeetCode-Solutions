class Solution {
    public int[][] generateMatrix(int n) {
         int top=0;
          int[][] matrix=new int[n][n];
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;
        int left=0;
        int dir=0;
       
        int k=1;
        while(top<=bottom&&left<=right){
           if(dir==0){
               for(int j=left;j<=right;j++){
                   matrix[top][j]=k++;
               }
               top++;
           }
           else if(dir==1){
               for(int j=top;j<=bottom;j++){
                   matrix[j][right]=k++;
               }
               right--;
           }
           else if(dir==2){
               for(int j=right;j>=left;j--){
                   matrix[bottom][j]=k++;
               }
               bottom--;
           }
           else{
               for(int j=bottom;j>=top;j--){
                matrix[j][left]=k++;
               }
               left++;
           }
           dir=(dir+1)%4;
        }
        return matrix;
    
    }
}
