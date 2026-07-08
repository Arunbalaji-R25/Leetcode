class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount+1];
        Arrays.fill(memo,-2);
        return solve(coins, amount, memo);
    }
    public int solve(int[] coins, int rem, int[] memo){
        if(rem<0) return -1;
        if(rem==0) return 0;
        if(memo[rem] != -2) return memo[rem];
        int min = Integer.MAX_VALUE;
        for(int i:coins){
            int res = solve(coins, rem-i, memo);
            if(res>=0 && res<min) min = 1+res;
        }
        memo[rem] = (min == Integer.MAX_VALUE) ? -1:min;
        return memo[rem];
    }
}