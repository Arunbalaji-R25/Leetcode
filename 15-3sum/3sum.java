class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>lst=new ArrayList<>();
        HashSet<List<Integer>>set=new HashSet<>();
    
        
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            
            
            int left=i+1,right=nums.length-1;
            while(left<right){
                List<Integer>subset=new ArrayList<>();
                if(nums[i]+nums[left]+nums[right]==0){
                    subset.add(nums[i]);
                    subset.add(nums[left]);
                    subset.add(nums[right]);
                    set.add(subset);
                    
                    left++;
                    right--;

                }
                if(nums[i]+nums[left]+nums[right]>0){
                    right--;
                }
                if(nums[i]+nums[left]+nums[right]<0){
                    left++;
                }


            }
              
        }
        for(List<Integer> values:set){
            lst.add(values);
        }
        return lst;
    }
}