class Solution {
    public String convertToTitle(int n) {
        StringBuilder ans=new StringBuilder();
        while(n>0){
            n--;
            int rem=n%26;
            char ch=(char)('A'+rem);
            ans.append(ch);
            n/=26;
        }
        return ans.reverse().toString();
    }
}