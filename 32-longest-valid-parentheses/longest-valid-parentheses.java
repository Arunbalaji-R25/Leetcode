class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int max = 0;
        for(int c=0;c<s.length();c++){
            if(s.charAt(c)=='('){
                st.push(c);
            }else{
                st.pop();
                if(st.isEmpty()){
                    st.push(c);
                }else{
                    max = Math.max(max,c-st.peek());
                }
                
            }
        }
        return max;
    }
}