class Solution {
    public int subtractProductAndSum(int n) {
        
        int sum = 0;
        int pro = 1;
        while(n>0){
            int digits = n%10;
            sum += digits;
            pro *= digits;
            n=n/10;
        }
        return pro - sum;
    }
}