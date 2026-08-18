class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> s = new Stack<>();
        int[] res = new int[t.length];
        for(int i=0;i<t.length;i++)
        {
            int cur =t[i];
            while(!s.isEmpty() && cur>t[s.peek()])
            {
                int in = s.pop();
                res[in] = i-in;
            }
            s.push(i);
        }
        return res;
    }
}
