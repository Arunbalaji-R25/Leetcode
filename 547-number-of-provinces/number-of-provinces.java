class Solution {
    public void bfs(int[][] isConnected,boolean[] visited,int s){
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        visited[s] = true;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int i=0;i<isConnected.length;i++){
                if(!visited[i] && isConnected[node][i] == 1){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                bfs(isConnected,visited,i);
                count++;
            }
        }
        return count;
    }
}