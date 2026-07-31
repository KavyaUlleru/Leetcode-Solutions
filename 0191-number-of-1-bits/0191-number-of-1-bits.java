class Solution {
    public int hammingWeight(int n) {
        int[] b=new int[100];
        int i=0;
        while(n>0){
            int rem=n%2;
            b[i]=rem;
            i++;
            n=n/2;
        }
        int count=0;
        for(int j=0;j<i;j++){
            if(b[j]==1){
                count++;
            }
        }
        return count;
    }
}