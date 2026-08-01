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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Queue<TreeNode> q=new ArrayDeque<>();
        if(root==null)
            return res;
        q.offer(root);
        while(!q.isEmpty()){
            int s=q.size();
            TreeNode last=null;
            for(int i=0;i<s;i++){
                last=q.poll();
                if(last.left!=null)
                    q.offer(last.left);
                if(last.right!=null)
                    q.offer(last.right);
                
            }
            res.add(last.val);
        }
        return res;
    }
}