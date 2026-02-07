class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxc = 0;
        for(int i:nums){
            if(i==1){
                count++;
                if(count>maxc){
                    maxc = count;
                }
            }else{
                count = 0;
            }
        }
        return maxc;
    }
}