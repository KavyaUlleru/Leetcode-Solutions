class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='{' || ch=='(' || ch=='['){
                st.push(ch);
            }else{
                if(st.isEmpty())return false;
                char op=st.peek();
                if((ch==')' && op!='(')||(ch=='}' && op!='{') || (ch==']' && op!='['))
                    return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
}