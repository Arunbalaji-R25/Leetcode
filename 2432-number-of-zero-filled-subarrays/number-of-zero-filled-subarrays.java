class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c = 0;
        long streak = 0;
        for(int i:nums){
            if(i==0){
                streak += 1;
            }else{
                streak = 0;
            }
            c += streak;
        }
        return c;
    }
}