class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int c=0;
            if(!ans.contains(nums[i])){
                for(int j=0;j<n;j++){
                    if(nums[i]==nums[j])
                    c++;
                }
            }
            if(c>n/3)
            ans.add(nums[i]);
        }
        return ans;
    }
}