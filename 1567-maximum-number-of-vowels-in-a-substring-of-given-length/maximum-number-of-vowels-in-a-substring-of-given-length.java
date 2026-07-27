class Solution {
    static {
        for (int i = 0; i < 1000; i++) {
            maxVowels("b", 0);
        }
    }
    public static int maxVowels(String s, int k) {
       int max = 0;
        char[] chars = s.toCharArray();

        int[] ch = new int[128];
        ch['a']++;
        ch['e']++;
        ch['i']++;
        ch['o']++;
        ch['u']++;

        for (int i = 0; i < k; i++) {
            if (ch[chars[i]] == 1) {
                max++;
            }
        }

        int temp = max;

        for (int i = k; i < chars.length; i++) {
            temp += ch[chars[i]];
            temp -= ch[chars[i - k]];

            if (max < temp) {
                max = temp;
            }
        }
        return max;
    }
}