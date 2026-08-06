class Solution {
    public int smallestNumber(int n, int t){
        while(product(n)%t!=0){
            n++;
        }
        return n;
    }
    public int product(int n) {
        int idx = 1;
        while(n!=0){
            idx *= n%10;
            n/=10;
        }
        return idx;
    }
}