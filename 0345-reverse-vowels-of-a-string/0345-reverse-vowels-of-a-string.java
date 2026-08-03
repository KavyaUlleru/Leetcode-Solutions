class Solution {
    public String reverseVowels(String s) {
        String v="aeiouAEIOU";
        char[] str=s.toCharArray();
        int left=0,right=str.length-1;
        while(left<right){
            while(left<right && v.indexOf(str[left])==-1)
                left++;
            while(left<right && v.indexOf(str[right])==-1)
                right--;
            char ch=str[left];
            str[left]=str[right];
            str[right]=ch;
            left++;
            right--;
        }
        return new String(str);
    }
}