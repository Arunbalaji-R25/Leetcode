class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String c:tokens){
            if(c.equals("+")){
                st.push(st.pop()+st.pop());
            }else if(c.equals("-")){
                int sec = st.pop();
                int fir = st.pop();
                st.push(fir - sec);
            }else if(c.equals("*")){
                st.push(st.pop()*st.pop());
            }else if(c.equals("/")){
                int sec = st.pop();
                int fir = st.pop();
                st.push(fir/sec);
            }else{
                st.push(Integer.parseInt(c));
            }
        }
        return st.peek();
    }
}