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
    public boolean valid(TreeNode root, TreeNode l, TreeNode r){
        if(root == null){
            return true;
        }
        if(l != null && l.val<=root.val){
            return false;
        }
        if(r != null && r.val>=root.val){
            return false;
        }
        return valid(root.left,root,r) && valid(root.right,l,root);
    }
    public boolean isValidBST(TreeNode root) {
        TreeNode l = null;
        TreeNode r = null;
        return valid(root,l,r);
    }
}