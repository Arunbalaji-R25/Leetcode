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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> lst = new ArrayList<>();
        postorder(lst,root);
        return lst;
    }
    public void postorder(List<Integer> lst, TreeNode root){
        if(root == null) return;
        postorder(lst,root.left);
        postorder(lst,root.right);
        lst.add(root.val);
    }
}