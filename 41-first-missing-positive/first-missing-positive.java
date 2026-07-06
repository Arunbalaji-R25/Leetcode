class Solution {
    public int firstMissingPositive(int[] nums) {
        int k = 1;
        Arrays.sort(nums);
        for(int i:nums){
            if(i==k) k++;
            else if(i>k) return k;
        }
        return k;
    }
}