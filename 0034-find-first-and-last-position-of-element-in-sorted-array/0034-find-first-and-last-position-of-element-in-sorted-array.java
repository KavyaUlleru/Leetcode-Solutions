class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=-1,high=-1;
        if(nums.length<=0)
            return new int[]{low,high};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                low=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                high=i;
                break;
            }
        }
        return new int[]{low,high};
    }
}