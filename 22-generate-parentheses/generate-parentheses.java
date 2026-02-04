class Solution {

    public static void Recursive(String str,int op,int cp,int n,List<String> result){
        if(op==n && cp==n){
            result.add(str);
        }
        if(op<n){
            Recursive(str+"(",op+1,cp,n,result);
        }
        if(cp<op){
            Recursive(str+")",op,cp+1,n,result);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String str = "";
        Recursive(str,0,0,n,result);
        return result;
    }
}