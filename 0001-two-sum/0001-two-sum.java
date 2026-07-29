class Solution {
    public int[] twoSum(int[] nums, int target) {
        
            int[] result = new int[2];
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        result[0]=i;
                        result[1]=j;
                    }
                }
            }
        return result;
        
    }
    public static void main(String args[]){
        Solution ob = new Solution();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Input = ");
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
        int target = sc.nextInt();
        System.out.println("Target:"+target);
        System.out.println(ob.twoSum(nums,target));
    }
}