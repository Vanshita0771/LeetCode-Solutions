class Solution {
    ArrayList<Integer> arr=new ArrayList<>();
    void inOrder(TreeNode root){
        if(root==null) return;
        inOrder(root.left);
        arr.add(root.val);
        inOrder(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root);
        return arr.get(k-1);
    }
}
