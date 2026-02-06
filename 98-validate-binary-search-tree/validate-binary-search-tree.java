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
    public boolean utility(TreeNode root, TreeNode mn, TreeNode mx){
        if(root == null){
            return true;
        }
        if(mn != null && mn.val<=root.val){
            return false;
        }
        if(mx != null && mx.val>=root.val){
            return false;
        }
        return utility(root.left,root,mx) && utility(root.right,mn,root);
    }
    public boolean isValidBST(TreeNode root) {
        TreeNode mn = null;
        TreeNode mx = null;
        return utility(root,mn,mx);
    }
}