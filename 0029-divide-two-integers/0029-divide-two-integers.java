class Solution {
    public int divide(int dividend, int divisor) {
        int res=(int)dividend/divisor;
        //int d= (int)Math.pow(2,31)-1;
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        if(res>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(res<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return res;
    }
}