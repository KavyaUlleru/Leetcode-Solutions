class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++){
            int temp=i;
            int count=0;
            int j=0;
            int[] b=new int[50];
            while(temp>0){
                b[j++]=temp%2;
                temp/=2;
            }
            for(int k=0;k<j;k++){
                if(b[k]==1)
                    count++;
            }
            ans[i]=count;
            
        }
        return ans;
    }
}