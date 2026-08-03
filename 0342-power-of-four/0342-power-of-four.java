class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        for(int i=0;i<=Math.sqrt(n)+1;i++){
            if(n%4==0 && n==Math.pow(4,i)){
                return true;
            }
        }
        return false;
    }
}