class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int longest_cnt=0;
        int cnt=0;
        int lastsmaller=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]-1==lastsmaller){
                cnt+=1;
                lastsmaller=nums[i];
            }
            else if(nums[i]!=lastsmaller){
                cnt=1;
                lastsmaller=nums[i];
            }
            longest_cnt = Math.max(longest_cnt,cnt);
        }
        return longest_cnt;
    }
}