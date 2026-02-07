class Solution {
    public int findClosestNumber(int[] nums) {
        
        int n = nums.length;

        int minClose = Integer.MAX_VALUE;
        int val = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int close = Math.abs(nums[i]);
            if(close < minClose){
                minClose = close;
                val = nums[i];
            }else if(close == minClose && nums[i] > val){
                val = nums[i];
            }

        }
        return val;
    }
}