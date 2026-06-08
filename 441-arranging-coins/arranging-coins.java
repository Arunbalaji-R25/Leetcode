class Solution {
    public int arrangeCoins(int n) {
        int temp = n;
        int c = 0;
        int i = 1;
        while(n!=0){
            if(i<=n){
                c++;
                n = n - i;
                i++;
            }else{
                break;
            }
        }
        return c;
    }
}