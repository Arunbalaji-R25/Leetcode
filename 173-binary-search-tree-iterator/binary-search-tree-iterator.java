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
class BSTIterator {
    List<Integer> l = new ArrayList<>();
    int idx = 0;

    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        l.add(root.val);
        inorder(root.right);
    }

    public BSTIterator(TreeNode root) {
        inorder(root);
    }
    
    public int next() {
        int val = l.get(idx);
        idx++;
        return val;
    }
    
    public boolean hasNext() {
        return idx < l.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */