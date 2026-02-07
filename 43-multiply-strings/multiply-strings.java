class Solution {
    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) return "0";

        int m = num1.length(), n = num2.length();
        int[] res = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            int a = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int b = num2.charAt(j) - '0';
                res[i + j + 1] += a * b;
            }
        }
        for (int k = m + n - 1; k > 0; k--) {
            int carry = res[k] / 10;
            res[k] %= 10;
            res[k - 1] += carry;
        }

        int idx = (res[0] == 0) ? 1 : 0;
        StringBuilder sb = new StringBuilder();
        for (; idx < res.length; idx++) sb.append(res[idx]);

        return sb.toString();
    }
}
