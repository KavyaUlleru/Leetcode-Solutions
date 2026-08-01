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
    public int maxDepth(TreeNode root) {
        // if(root==null)
        //     return 0;
        // Queue<TreeNode> q=new ArrayDeque<>();
        // int level=0;
        // q.offer(root);
        // while(!q.isEmpty()){
        //     int s=q.size();
        //     level++;
        //     for(int i=0;i<s;i++){
        //         TreeNode temp=q.poll();
        //         if(temp.left!=null)
        //             q.offer(temp.left);
        //         if(temp.right!=null)
        //             q.offer(temp.right);
        //     }
        // }
        // return level;

        //recursion
        if(root==null)
            return 0;
        int leftdepth=maxDepth(root.left);
        int rightdepth=maxDepth(root.right);
        return 1+Math.max(leftdepth,rightdepth);
    }
}