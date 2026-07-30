class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        String s=strs[0];
        for(int i=0;i<s.length();i++){
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || s.charAt(i)!=strs[j].charAt(i)){
                    return sb.toString();
                }
            
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}