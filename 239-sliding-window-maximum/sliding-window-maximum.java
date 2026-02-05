class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1){
            return nums;
        }
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int m = Integer.MAX_VALUE;
        int[] res = new int[n-k+1];
        
        for(int i=0;i<n;i++){
            if(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }
            dq.addLast(i);
            int ind = -1; 
            if(i>=k-1){
                ind = dq.peekFirst();
                res[i-k+1] = nums[ind];
            }                                                      
        }
        return res;
    }
}