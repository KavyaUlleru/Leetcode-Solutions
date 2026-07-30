class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(String str:strs){
            char[] s=str.toCharArray();
            Arrays.sort(s);
            String st=new String(s);
            ArrayList<String> val=map.getOrDefault(st,new ArrayList<>());
            val.add(str);
            map.put(st,val);
        }
        return new ArrayList<>(map.values());
    }
}