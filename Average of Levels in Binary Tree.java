class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
         double avg=0;
         int count=0;
        while(!q.isEmpty()){
           TreeNode temp=q.remove();
           count++;
           avg+=temp.val;
           if(temp.left!=null)
            q.add(temp.left);
           if(temp.right!=null)
            q.add(temp.right);
           if(q.peek()==null){
                 q.remove();
                list.add(avg/count);
                avg=0;
                count=0;
                if(q.size()==0) break;
                else q.add(null);
           }
        }
        return list;
    }
}
