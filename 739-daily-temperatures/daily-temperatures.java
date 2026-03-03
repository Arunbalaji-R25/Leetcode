class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            if(stack.size()==0 || temperatures[stack.peek()]>=temperatures[i]){
                stack.push(i);
            }else{
                while(stack.size()>0 && temperatures[stack.peek()]<temperatures[i]){
                    int last = stack.pop();
                    res[last] = i - last;
                }
            }
            stack.push(i);
        }
        return res;
    }
}