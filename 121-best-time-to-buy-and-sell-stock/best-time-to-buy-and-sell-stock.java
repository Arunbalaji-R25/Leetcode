class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i:prices){
            if(i<min){
                min = i;
            }
            int curr = i-min;
            if(curr>profit){
                profit = i-min;
            }
        }
        return profit;
    }
}