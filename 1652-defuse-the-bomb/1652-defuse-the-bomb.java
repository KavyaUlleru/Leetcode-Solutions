class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] res=new int[n];
        if(k>0){
            for(int i=0;i<n;i++){
                int sum=0,temp=k,j=i+1;
                while(temp-->0){
                    if(j==n)
                        j=0;
                    sum+=code[j++];
                }
                res[i]=sum;
            }
        }else if(k<0){
            for(int i=0;i<n;i++){
                int sum=0,temp=k*-1,j=i-1;
                while(temp-->0){
                    if(j<0)
                        j=n-1;
                    sum+=code[j--];
                }
                res[i]=sum;
            }

        }else{
            for(int i=0;i<n;i++){
                res[i]=0;
            }
        }
        return res;
    }
}