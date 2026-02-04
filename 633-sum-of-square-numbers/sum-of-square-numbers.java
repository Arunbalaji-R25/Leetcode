class Solution {
    public boolean judgeSquareSum(int c) {
        long l = 0;
        long r = (long)(Math.sqrt(c));
        while(l<=r){
            long a = (l*l)+(r*r);
            if(a==c){
                return true;
            }else if(a<c){
                l++;
            }else{
                r--;
            }
        }
        return false;
    }
}