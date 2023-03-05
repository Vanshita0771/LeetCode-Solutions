class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int top=0;
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;
        int left=0;
        int dir=0;
        while(top<=bottom&&left<=right){
           if(dir==0){
               for(int j=left;j<=right;j++){
                   list.add(matrix[top][j]);
               }
               top++;
           }
           else if(dir==1){
               for(int j=top;j<=bottom;j++){
                   list.add(matrix[j][right]);
               }
               right--;
           }
           else if(dir==2){
               for(int j=right;j>=left;j--){
                   list.add(matrix[bottom][j]);
               }
               bottom--;
           }
           else{
               for(int j=bottom;j>=top;j--){
                   list.add(matrix[j][left]);
               }
               left++;
           }
           dir=(dir+1)%4;
        }
        return list;
    }
}




        
   
