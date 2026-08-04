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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newnode=new TreeNode(val);
        if(root==null){
            root=newnode;
            return root;
        }
        TreeNode cur=root;
        while(cur!=null){
            if(cur.val==val)
                return root;
            if(val<cur.val){
                if(cur.left==null){
                    cur.left=newnode;
                    break;
                }
                cur=cur.left;
            } 
            else{
                if(cur.right==null){
                    cur.right=newnode;
                    break;
                }
                cur=cur.right;
            }
        }
        return root;
    }
}