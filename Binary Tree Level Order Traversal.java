/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> list=new ArrayList<>();
        while(!q.isEmpty()){
           TreeNode temp=q.remove();
           list.add(temp.val);
           if(temp.left!=null)
            q.add(temp.left);
           if(temp.right!=null)
             q.add(temp.right);
            if(q.peek()==null){
                q.remove();
                ans.add(list);
                if(q.size()!=0){
                    list=new ArrayList<>();
                    q.add(null);
                }
            }
           
        }
         return ans;
    }
}
