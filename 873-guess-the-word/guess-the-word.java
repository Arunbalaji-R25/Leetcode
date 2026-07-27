/**
 * // This is the Master's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface Master {
 *     public int guess(String word) {}
 * }
 */
class Solution {
    public void findSecretWord(String[] words, Master master) {
        List<String> candidates = new ArrayList<>(Arrays.asList(words));
        while (!candidates.isEmpty()) {
            String guess = getBestWord(candidates);
            int matches = master.guess(guess);
            if (matches == 6)
                return;
            List<String> next = new ArrayList<>();
            for (String word : candidates) {
                if (match(word, guess) == matches) {
                    next.add(word);
                }
            }
            candidates = next;
        }
    }

    private String getBestWord(List<String> words) {
        String best = words.get(0);
        int minWorst = Integer.MAX_VALUE;
        for (String w1 : words) {
            int[] count = new int[7];
            for (String w2 : words) {
                count[match(w1, w2)]++;
            }
            int worst = 0;
            for (int c : count){
                worst = Math.max(worst, c);
            }
            if (worst < minWorst) {
                minWorst = worst;
                best = w1;
            }
        }
        return best;
    }

    private int match(String a, String b) {
        int cnt = 0;
        for (int i = 0; i < 6; i++) {
            if (a.charAt(i) == b.charAt(i))
                cnt++;
        }
        return cnt;
    }
}