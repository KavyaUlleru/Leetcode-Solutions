class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(Math.pow(i,2)==num){
                return true;
            }
        }
        return false;
    }
}