class Solution {
    public int thirdMax(int[] nums) {
       if(nums.length == 1 ) return nums[0];
       if(nums.length == 2 ) return Math.max(nums[0],nums[1]);
        long max = Long.MIN_VALUE;
        long sMax = Long.MIN_VALUE;
        long tMax = Long.MIN_VALUE;
        for(int num : nums){
            if(num == max || num == sMax || num == tMax) continue;
            if(num>max){
                tMax = sMax;
                sMax = max;
                max = num;
            }else if(num > sMax){
                tMax = sMax;
                sMax = num;
            }else if(num > tMax){
                tMax = num;
            }
        } 
        return (tMax == Long.MIN_VALUE)?(int)max:(int)tMax;
    }
}