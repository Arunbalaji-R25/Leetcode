class Solution {
    public int minimumDeletions(String s) {
        int a = 0, del = 0;
        for(char c:s.toCharArray()){
            if(c=='b') a+=1;
            else if(a>0){
                a-=1;
                del+=1;
            }
        }
        return del;
    }
}