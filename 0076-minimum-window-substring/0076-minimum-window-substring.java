class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> tmap=new HashMap<>();
        HashMap<Character,Integer> smap=new HashMap<>();
        for(char ch:t.toCharArray())
            tmap.put(ch,tmap.getOrDefault(ch,0)+1);
        int minlen=Integer.MAX_VALUE;
        String ans="";
        int left=0,right=0;
        while(right<s.length()){
            smap.put(s.charAt(right),smap.getOrDefault(s.charAt(right),0)+1);
            
            while(isValid(smap,tmap)){
                if((right-left+1)<minlen){
                    ans=s.substring(left,right+1);
                    minlen=right-left+1;
                }
                smap.put(s.charAt(left),smap.getOrDefault(s.charAt(left),0)-1);
                left++;
            }
            right++;
        }
        return ans;
    }
    public static boolean isValid(HashMap<Character,Integer> smap,HashMap<Character,Integer> tmap){
        
        for(char ch:tmap.keySet()){
            if(!smap.containsKey(ch) || tmap.get(ch)>smap.get(ch))
                return false;
        }
        return true;
    }
}