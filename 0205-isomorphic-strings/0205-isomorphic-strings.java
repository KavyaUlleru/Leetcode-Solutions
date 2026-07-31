class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        // int[] ss=new int[256];
        // int[] st=new int[256];
        // for(int i=0;i<s.length();i++){
        //     char schar=s.charAt(i);
        //     char tchar=t.charAt(i);
        //     if(ss[schar]!=st[tchar])
        //         return false;
        //     ss[schar]=i+1;
        //     st[tchar]=i+1;
        // }
        // return true;
        HashMap<Character,Character> StoT=new HashMap<>();
        HashMap<Character,Character> TtoS=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sc=s.charAt(i);
            char tc=t.charAt(i);
            if(StoT.containsKey(sc) && StoT.get(sc)!=tc)
                return false;
            if(TtoS.containsKey(tc) && TtoS.get(tc)!=sc)
                return false;
            StoT.put(sc,tc);
            TtoS.put(tc,sc);
        }
        return true;
    }
}