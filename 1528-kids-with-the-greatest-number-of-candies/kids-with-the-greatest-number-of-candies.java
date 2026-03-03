class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> lst = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies >= max){
                lst.add(true);
            }else{
                lst.add(false);
            }
        }
        return lst;
    }
}