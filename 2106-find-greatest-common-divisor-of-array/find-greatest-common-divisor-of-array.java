class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i:nums){
            if(i>max) max = i;
            if(i<min) min = i;
        }
        while(min!=0){
            int t = min;
            min = max%min;
            max = t;
        }
        return max;
    }
}