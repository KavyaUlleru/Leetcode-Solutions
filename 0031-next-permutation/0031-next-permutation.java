class Solution {
    public void nextPermutation(int[] nums) {
        int p=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                p=i;
                break;
            }
        }
        if(p==-1){
            int f=0,l=nums.length-1;
            while(f<l){
                int t=nums[f];
                nums[f]=nums[l];
                nums[l]=t;
                f++;
                l--;
            }
            return;
        }
        for(int i=nums.length-1;i>p;i--){
            if(nums[i]>nums[p]){
                int t=nums[i];
                nums[i]=nums[p];
                nums[p]=t;
                break;
            }
        }
        int s=p+1,e=nums.length-1;
        while(s<e){
            int t=nums[s];
            nums[s]=nums[e];
            nums[e]=t;
            s++;
            e--;
        }
    }
}