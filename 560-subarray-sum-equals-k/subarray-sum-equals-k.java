class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> set = new HashMap<>();
        set.put(0, 1);
        int sum = 0, count = 0;
        for(int i:nums){
            sum += i;
            if(set.containsKey(sum-k)){
                count += set.get(sum-k);
            }
            set.put(sum, set.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}