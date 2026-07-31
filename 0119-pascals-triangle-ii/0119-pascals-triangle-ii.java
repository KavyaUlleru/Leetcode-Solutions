class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row=new ArrayList<>();
        long v=1;
        for(int i=0;i<=rowIndex;i++){
            row.add((int)v);
            v=v*(rowIndex-i)/(i+1);
        }
        return row;
    }
}