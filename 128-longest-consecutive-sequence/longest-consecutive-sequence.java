class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxlen = 0;
        for(int num:nums){
            set.add(num);
        }
        if(nums.length ==0) return 0;
        for(int num:set){
            if(!set.contains(num-1)){
                int current = num;
                int streak = 1;
                while(set.contains(current+1)){
                    current++;
                    streak++;
                }
                maxlen = Math.max(maxlen, streak);
            }
        }
        return maxlen;
    }
}