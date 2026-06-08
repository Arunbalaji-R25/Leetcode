class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        int min = nums[0]; 
        for(int i:nums){
            min = Math.min(min,i);
        }
        int res = 0;
        for(int i:nums){
            res = res + i - min;
        }
        return res;
    }
}