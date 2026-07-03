class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums,target);
        int last = findLast(nums,target);
        return new int[]{first,last};
    }
    public int findFirst(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                ans = mid;
                high = mid-1;
            }else if(arr[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    public int findLast(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                ans = mid;
                low = mid+1;
            }else if(arr[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}