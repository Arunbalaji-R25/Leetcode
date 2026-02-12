class Solution {
    public int longestBalanced(String s) {
        char[] arr = s.toCharArray();
        int[] freq = null;
        int n = arr.length;
        int ans = 1;
        for (int i = 0; i < n - 1 & (n - i > ans); i++) {
            freq = new int[128];
            int dis = 0;
            int maxFreq = 1;
            for (int j = i; j < n; j++) {
                freq[arr[j]]++;
                if (freq[arr[j]] == 1) {
                    dis++;
                }
                maxFreq = Math.max(maxFreq, freq[arr[j]]);
                if ((j - i + 1) == maxFreq * dis) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}