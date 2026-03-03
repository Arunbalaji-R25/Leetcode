class Solution {
    public int[] runningSum(int[] nums) {
        
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            lst.add(lst.get(i-1)+nums[i]);
        }
        int[] arr = new int[nums.length];
        int i=0;
        for(int x:lst){
            arr[i] = x;
            i++;
        }
        return arr;
    }
}