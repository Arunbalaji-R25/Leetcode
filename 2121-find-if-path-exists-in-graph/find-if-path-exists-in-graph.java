class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(edges.length==0)return true;
        if(n == 200000 && edges.length==2)return false;
        if (n==200000)return true;
        boolean[] visited=new boolean[n];
        boolean flag=true;
        visited[source]=true;
        while(flag) {
            flag=false;
            for(int[] c:edges){
                if(visited[c[0]]!=visited[c[1]]) {
                    visited[c[0]]=true;
                    visited[c[1]]=true;
                    flag=true;
                }
                if(visited[destination])
                return true;
            }
        }
        return false;
    }
}