class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer>  stack = new Stack<>();
        int[] res = new int[t.length]; 
        for(int i=0;i<t.length;i++)
        {
            int cur = t[i];
            while(!stack.isEmpty() && cur > t[stack.peek()])
            {
                int index = stack.pop();
                res[index] = i-index;
            }
            stack.push(i);
        }
        return res;
    }
}
