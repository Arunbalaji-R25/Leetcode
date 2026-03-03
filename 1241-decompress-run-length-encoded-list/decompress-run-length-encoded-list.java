class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n= nums.length;
        int size = 0;
        
        for(int i=0;i<n;i+=2){
            size += nums[i];
        }
        int[] arr = new int[size];
        int sind = 0;
        for(int i=0;i<n;i+=2){
            int freq = nums[i];
            int val = nums[i+1];
            int eind = sind + freq;
            Arrays.fill(arr,sind,eind,val);
            sind = eind;
        }
        return arr;
    }
}