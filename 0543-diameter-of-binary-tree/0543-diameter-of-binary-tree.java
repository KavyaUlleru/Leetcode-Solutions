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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return diameter;
        
    }
    public int depth(TreeNode root){
        if(root==null)
            return 0;
        int lf=depth(root.left);
        int rt=depth(root.right);
        this.diameter=Math.max(diameter,lf+rt);
        return Math.max(lf,rt)+1;
    }
}