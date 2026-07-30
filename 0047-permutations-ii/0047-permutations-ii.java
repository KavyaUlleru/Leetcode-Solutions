class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        int f=1;
        for(int i=1;i<=n;i++)
            f*=i;
        
        for(int i=0;i<f;i++){
            List<Integer> list=toList(permute(nums));
            if(!ans.contains(list))
                ans.add(list);
        }
        return ans;
    }
    public static int[] permute(int[] a){
        int p=-1;
        for(int i=a.length-2;i>=0;i--){
            if(a[i]<a[i+1]){
                p=i;
                break;
            }
        }
        if(p==-1){
            reverse(0,a.length-1,a);
            return a;
        }
        for(int i=a.length-1;i>p;i--){
            if(a[i]>a[p]){
                int t=a[i];
                a[i]=a[p];
                a[p]=t;
                break;
            }
        }
        reverse(p+1,a.length-1,a);
        return a;
    }
    public static void reverse(int s,int e,int[] nums){
        while(s<e){
            int t=nums[s];
            nums[s]=nums[e];
            nums[e]=t;
            s++;
            e--;
        }
    }
    public static List<Integer> toList(int[] arr){
        List<Integer> list=new ArrayList<>();
        for(int i:arr)
            list.add(i);
        return list;
    }
}