class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length())
            return false;
        
        int n = s.length();
        int m = t.length();
        int i = 0;
        int j = 0;

        while(i<n && j<m) {
            int ch = s.charAt(i);
            while(j<m && t.charAt(j)!=ch) {
                j++;
            }

            if(j == m) return false;

            i++;
            j++;
        }

        if(i<n) return false;

        return true;
    }
}