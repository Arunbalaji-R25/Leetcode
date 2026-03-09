class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] height = new int[m];
        Arrays.fill(height, 0);
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (matrix[i][j] == '0') {
                    height[j] = 0;
                } else {
                    height[j]++;
                }
                int h = height[j];
                for (int k = j; k >=0; --k) {
                    h = Math.min(h, height[k]);
                    if (h == 0) break;
                    ans = Math.max(ans, h * (j - k + 1));
                }
            }
        }
        return ans;
    }
}