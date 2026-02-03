class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int c= nums[0]*nums[1]*nums[nums.length-1];
        int d= nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        return Math.max(c,d);
    }
}