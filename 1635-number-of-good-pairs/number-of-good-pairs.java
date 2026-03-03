class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int x:nums){
            count += map.getOrDefault(x,0);
            map.put(x,map.getOrDefault(x,0)+1);
        } 
        return count;
    }
}