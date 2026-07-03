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
    public List<TreeNode> generateTrees(int n) {
        if(n>0){
            return Trees(1,n);
        }
        return new ArrayList<>();
    }

    public List<TreeNode> Trees(int s, int e){
        ArrayList<TreeNode> lst = new ArrayList<>();
        if(s>e){
            lst.add(null);
            return lst;
        }

        for(int i=s;i<=e;i++){
            List<TreeNode> left = Trees(s,i-1);
            List<TreeNode> right = Trees(i+1,e);
            for(TreeNode l:left){
                for(TreeNode r:right){
                    TreeNode curr = new TreeNode(i);
                    curr.left = l;
                    curr.right = r;
                    lst.add(curr);
                }
            }
        }
        return lst;
    }
}