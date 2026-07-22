class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord)){
            return 0;
        }
        
        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        HashSet<String> vis = new HashSet<>();
        vis.add(beginWord);
        int count = 1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                String word = q.poll();
                if(word.equals(endWord)){
                    return count;
                }
                char[] ch = word.toCharArray();
                for(int j=0;j<ch.length;j++){
                    char origin = ch[j];
                    for(char c='a';c<='z';c++){
                        ch[j] = c;
                        String nxt = new String(ch);
                        if(set.contains(nxt) && !vis.contains(nxt)){
                            vis.add(nxt);
                            q.offer(nxt);
                        }
                    }
                    ch[j] = origin;
                }
            }
            count++;
        }
        return 0;
    }
}