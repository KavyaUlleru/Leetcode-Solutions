class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st=new Stack<>();
        Queue<Integer> q=new ArrayDeque<>();
        for(int i:students)
            q.offer(i);
        for(int i=sandwiches.length-1;i>=0;i--)
            st.push(sandwiches[i]);
        int c=0;
        while(!q.isEmpty() && c<=q.size()){
            if(q.peek()==st.peek()){
                q.poll();
                st.pop();
                c=0;
            }else{
                int val=q.poll();
                c++;
                q.offer(val);
            }
        }
        return q.size();
    }
}