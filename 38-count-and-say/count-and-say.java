class Solution {
    public static String encode(String str){
        StringBuilder sb= new StringBuilder();
        char[] nums = str.toCharArray();
        char curr = nums[0];
        int count = 0;
        for(char num : nums){
            if(num == curr){
                count++;
            }else{
                sb.append(count);
                sb.append(curr);
                curr = num;
                count = 1;
            }
        }
        sb.append(count);
        sb.append(curr);
        return sb.toString();
    }
    public String countAndSay(int n) {
        if(n == 1) return "1";
        return encode(countAndSay(n-1));
    }
}