class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        // for(int left=0;left<s.length();left++){
        //     List<Character> list=new ArrayList<>();
        //     int right=left;
        //     while(right<s.length() && !list.contains(s.charAt(right))){
        //         list.add(s.charAt(right));
        //         right++;
        //     }
        //     max=Math.max(max,list.size());
        // }
        HashSet<Character> set=new HashSet<>();
        int left=0,right=0;
        for(right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max=Math.max(max,set.size());
        }
        return max;
    }
}