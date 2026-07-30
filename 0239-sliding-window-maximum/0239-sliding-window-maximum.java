class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //brute force
        // int[] res=new int[nums.length-k+1];
        // int ind=0;
        // for(int i=0;i<=nums.length-k;i++){
        //     int max=nums[i];
        //     for(int j=i;j<i+k;j++){
        //         if(nums[j]>max)max=nums[j];
        //     }
        //     res[ind++]=max;
        // }
        // return res;

        int res[] =new int[nums.length-k+1];
        Deque<Integer> dq=new ArrayDeque<>();
        int ind=0;
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && nums[i]>nums[dq.peekLast()])
                dq.pollLast();
            dq.offerLast(i);
        }
        res[ind++]=nums[dq.peekFirst()];
        for(int i=k;i<nums.length;i++){ 
            if(i-k==dq.peekFirst())
                dq.pollFirst();
            while(!dq.isEmpty() && nums[i]>nums[dq.peekLast()])
                dq.pollLast();
            dq.offerLast(i);
            res[ind++]=nums[dq.peekFirst()];
        }
        return res;
    }
}
