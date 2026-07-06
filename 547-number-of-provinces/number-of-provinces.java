class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int comp=0;
        boolean vis[]=new boolean [n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,isConnected,vis);
                comp++;
            }
        }
        return comp;
    }
    public void dfs(int v,int[][] isConnected,boolean vis[]){
        vis[v]=true;
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[v][i]==1 && !vis[i]){
                dfs(i,isConnected,vis);
            }
        }
    }
}