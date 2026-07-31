class Solution {
    public int trailingZeroes(int n) {
        int sum=0;
        int i=1;
        int val=Integer.MAX_VALUE;
        while(val>0){
            val=n/(int)Math.pow(5,i);
            sum+=val;
            i++;
        }
        return sum;
    }
}