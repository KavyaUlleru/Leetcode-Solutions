class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> a=new ArrayList<>();
            int v=1;
            for(int j=0;j<=i;j++){
                a.add(v);
                v=v*(i-j)/(j+1);
            }
            res.add(a);
        }
        return res;
    }
}