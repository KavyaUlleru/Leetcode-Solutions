class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1) return true;
        for(int i=0;i<=Math.sqrt(n)+1;i++){
            if(n%3==0 && n==Math.pow(3,i)){
                return true;
            }
        }
        return false;
    }
}