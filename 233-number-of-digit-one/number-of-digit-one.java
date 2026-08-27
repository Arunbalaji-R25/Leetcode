class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        long fctr = 1;
        while(fctr<=n){
            long high = n/(fctr*10);
            long curr = (n/fctr)%10;
            long lower = n%fctr;
            if(curr == 0){
                count += high*fctr;
            }else if(curr == 1){
                count += high*fctr+lower+1;
            }else{
                count += (high+1)*fctr;
            }
            fctr *= 10;
        }
        return count;
    }
}