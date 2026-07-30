class Solution {
    public int largestRectangleArea(int[] h) {
        // int maxarea=-1;
        // for(int i=0;i<heights.length;i++){
        //     int height=heights[i];
        //     for(int j=i;j<heights.length;j++){
        //         height=Math.min(height,heights[j]);
        //         int area=height*(j-i+1);
        //         maxarea=Math.max(maxarea,area);
        //     }
        // }
        // return maxarea;
        int[] next=new int[h.length];
        int[] prev=new int[h.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<h.length;i++){
            while(!st.isEmpty() && h[st.peek()]>=h[i])
                st.pop();
            if(st.isEmpty())
                prev[i]=-1;
            else
                prev[i]=st.peek();
            st.push(i);
        }
        while(!st.isEmpty())st.pop();
        for(int i=h.length-1;i>=0;i--){
            while(!st.isEmpty() && h[st.peek()]>=h[i])
                st.pop();
            if(st.isEmpty())
                next[i]=h.length;
            else
                next[i]=st.peek();
            st.push(i);
        }
        int max=-1;
        for(int i=0;i<h.length;i++){
            max=Math.max(max,h[i]*(next[i]-prev[i]-1));
        }
        return max;
    }
}