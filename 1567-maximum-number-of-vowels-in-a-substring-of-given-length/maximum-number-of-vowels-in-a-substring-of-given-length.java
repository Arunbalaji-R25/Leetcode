class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int vow = 0;
        int max = 0;
        

        for(int i=0;i<k;i++){
            
            if("aeiou".contains(String.valueOf(s.charAt(i)))){
                vow++;
            }
        }
        max = vow;
        int l = 0;
        for(int i=k;i<n;i++){
            
            if("aeiou".contains(String.valueOf(s.charAt(i-k)))){
                vow--;
            }
            
            if("aeiou".contains(String.valueOf(s.charAt(i)))){
                vow++;
            }
            max = Math.max(max,vow);
        }
        return max;
    }
}