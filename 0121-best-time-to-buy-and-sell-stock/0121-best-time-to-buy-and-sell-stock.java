class Solution {
    public int maxProfit(int[] prices) {
        int mprofit=0;
        int buy=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buy<prices[i]){
                int profit=prices[i]-buy;
                mprofit=Math.max(mprofit,profit);
            }else{
                buy=prices[i];
            }
        }
        return mprofit;
    }
}