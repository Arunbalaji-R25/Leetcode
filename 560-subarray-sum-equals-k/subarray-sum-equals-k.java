class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> set = new HashMap<>();
        set.put(0, 1);
        int tot = 0, count = 0;
        for(int i:nums){
            tot += i;
            if(set.containsKey(tot-k)){
                count += set.get(tot-k);
            }
            set.put(tot, set.getOrDefault(tot, 0)+1);
        }
        return count;
    }
}