class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        for(int i=2*n;i>=0;i--){
            int idx = i%n;
            while(!st.isEmpty() && st.peek()<=nums[idx]){
                st.pop();
            }
            if(i<n) ans[i] = st.isEmpty()?-1:st.peek();
            st.push(nums[idx]);
        }
        return ans;

    }
}