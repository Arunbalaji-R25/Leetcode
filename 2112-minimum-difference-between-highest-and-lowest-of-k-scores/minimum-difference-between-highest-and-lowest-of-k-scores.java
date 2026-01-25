class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int n = nums.length;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int i=0;
        while(i+k <= n){
            int diff = nums[i+k-1]-nums[i];
            min = Math.min(min,diff);
            i++;
        }
        return min;
    }
}