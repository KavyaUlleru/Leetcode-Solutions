class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int f=1;
        for(int i=1;i<=nums.length;i++)
        f*=i;
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        list.add(toList(nums));
        for(int i=1;i<f;i++){
            list.add(toList(nextpermute(nums)));
        }
        return list;
    }
    public static int[] nextpermute(int[] a){
        
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
    public static void reverse(int s,int e,int[] a){
        while(s<e){
            int t=a[s];
            a[s]=a[e];
            a[e]=t;
            s++;
            e--;
        }
    }
    public static List<Integer> toList(int[] nums){
        List<Integer> list=new ArrayList<>();
        for(int v:nums)
        list.add(v);
        return list;
    }
}