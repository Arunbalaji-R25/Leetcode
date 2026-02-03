class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int msf = Integer.MIN_VALUE;
        int me = 0;
        for(int i=0;i<n;i++){
            me = me + nums[i];
            if(me>msf){
                msf = me;
            }if(me<0){
                me = 0;
            }
        }
        return msf;
    }
}