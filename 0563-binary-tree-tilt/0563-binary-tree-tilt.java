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
    int tilt=0;
    public int findTilt(TreeNode root) {
        bfs(root);
        return tilt;
    }
    public int bfs(TreeNode root){
        if(root==null)
            return 0;
        int left=bfs(root.left);
        int right=bfs(root.right);
        
        tilt+=Math.abs(left-right);
        return left+right+root.val;
    }
}