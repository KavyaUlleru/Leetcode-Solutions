class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        for(int i=0;i<=Math.sqrt(n)+1;i++){
            if(n%2==0 && n==Math.pow(2,i)){
                return true;
            }
        }
        return false;
    }
}