class Solution {
    public int majorityElement(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     int count=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count>nums.length/2){
        //         return nums[i];
        //     }
        // }
        // return -1;
        int can=nums[0];
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==can)
                c++;
            else{
                c--;
                if(c==0){
                    can=nums[i];
                    c=1;
                }
            }
        }
        return can;
    }
}