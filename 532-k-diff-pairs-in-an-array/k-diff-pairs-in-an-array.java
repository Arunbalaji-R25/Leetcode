class Solution {
    public int findPairs(int[] nums, int k) {
        
        int c = 0;
        if(k<0){
            return 0;
        }
        if(k==0){
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i:nums){
                map.put(i,map.getOrDefault(i,0)+1);

            }
            for(int i: map.keySet()){
                if(map.get(i)>1) c++;
            }
        }
        else{
            HashSet<Integer> set = new HashSet<>();
            for(int i: nums){
                set.add(i);
            }
            for(int i : set){
                if(set.contains(i-k)) c++;
            }
        }
        return c;
    }
}