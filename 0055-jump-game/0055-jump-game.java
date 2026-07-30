class Solution {
    public boolean canJump(int[] nums) {
        int reach=0,i=0;
        for(i=0;i<nums.length;i++){
            if(i>reach)
                return false;
            reach=Math.max(reach,i+nums[i]);
        }

            return true;

    }
}