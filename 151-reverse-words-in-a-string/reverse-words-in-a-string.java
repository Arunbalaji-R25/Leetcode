class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int left = 0;
        int right = words.length-1;
        while(left<right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            if(!word.isEmpty()){
                if(sb.length()>0){
                    sb.append(" ");
                }
                sb.append(word);
            }
        }
        return sb.toString();
    }
}