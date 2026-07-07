class Solution {
    public boolean isNumber(String s) {
        boolean isDot = false;
        boolean isE = false;
        boolean num = false;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)) num = true;
            else if(c=='+' || c=='-'){
                if(i>0 && s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E') return false; 
            }else if(c=='e' || c=='E'){
                if(isE || !num) return false;
                isE = true;
                num = false;
            }else if(c=='.'){
                if(isDot || isE) return false;
                isDot = true;
            }else return false;
        }
        return num;
    }
}