class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0) return true;
        int temp = num;
        int rev = 0;
        while(temp>0){
            int digits = temp%10;
            rev = rev*10+digits;
            temp = temp/10;
        }
        int rev2 = 0;
        while(rev>0){
            int digits = rev%10;
            rev2 = rev2*10+digits;
            rev = rev/10;
        }
        if(rev2 != num){
            return false;
        }
        return true;
        
    }
}