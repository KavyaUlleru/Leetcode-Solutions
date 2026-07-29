class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] res=new int[m+n];
        int i=0;
        for(i=0;i<m;i++){
            res[i]=nums1[i];
        }
        for(int j=0;j<n;j++){
            res[i++]=nums2[j];
        }
        Arrays.sort(res);
        double med;
        if(i%2==0){
            med=(res[i/2]+res[(i/2)-1])/2.0;
        }else{
            med=res[i/2];
        }
        return med;
    }
}