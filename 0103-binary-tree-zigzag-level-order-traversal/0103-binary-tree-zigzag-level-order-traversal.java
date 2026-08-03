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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new ArrayDeque<>();
        if(root==null)
            return res;
        q.offer(root);
        boolean rev=false;
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode temp=q.poll();
                list.add(temp.val);
                if(temp.left!=null)
                    q.offer(temp.left);
                if(temp.right!=null)
                    q.offer(temp.right);
                
            }
            if(rev){
                Collections.reverse(list);
                res.add(list);
                rev=false;
            }else{
                res.add(list);
                rev=true;
            }
        }
        return res;
    }
}