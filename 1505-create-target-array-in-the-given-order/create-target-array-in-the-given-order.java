class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            lst.add(index[i],nums[i]);
        }
        int[] arr = new int[lst.size()];
        int i=0;
        for(int x:lst){
            arr[i] = x;
            i++;
        }
        return arr;
    }
}