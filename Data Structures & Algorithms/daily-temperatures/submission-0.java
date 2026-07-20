class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[t.length];
        for(int i=0;i<t.length;i++)
        {
            int curr = t[i];
            while(!stack.isEmpty()&&curr>t[stack.peek()])
            {
                int index =stack.pop();
                ans[index] = i - index;
            }
            stack.push(i);
        }
        return ans;
    }
}
