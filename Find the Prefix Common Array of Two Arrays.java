class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        int[] c=new int[A.length];
        int count=0;
        for(int i=0;i<A.length;i++){
    
          set1.add(A[i]);
          set2.add(B[i]);
          if(A[i]==B[i])
           count++;
          else{
          if(set1.contains(B[i])) count++;
          if(set2.contains(A[i])) count++;
          }
          c[i]=count;
        }
        return c;
    }
}
