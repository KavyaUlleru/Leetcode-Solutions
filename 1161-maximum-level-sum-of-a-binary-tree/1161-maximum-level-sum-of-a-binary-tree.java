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
    public int maxLevelSum(TreeNode root) {
         List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new ArrayDeque<>();
        int lev=0,reslev=0,max=Integer.MIN_VALUE;
        if(root==null)
            return 0;
        q.offer(root);
        while(!q.isEmpty()){
            int s=q.size();
            lev++;
            // List<Integer> list=new ArrayList<>();
            int sum=0;
            for(int i=0;i<s;i++){
                TreeNode temp=q.poll();
                // list.add(temp.val);
                sum+=temp.val;
                 if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
                
            }
            if(sum>max){
                max=sum;
                reslev=lev;
            }
        }
        // int max=Integer.MIN_VALUE;
        // int lev=0;
        // for(int i=0;i<res.size();i++){
        //     int sum=0;
        //     for(int j=0;j<res.get(i).size();j++){
        //         sum+=res.get(i).get(j);
        //     }
        //     if(sum>max){
        //         max=sum;
        //         lev=i+1;
        //     }
        // }
        return reslev;
    }
}