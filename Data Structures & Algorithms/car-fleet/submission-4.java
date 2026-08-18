class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] cars = new int[n][2];
        for(int i=0;i<n;i++)
        {
           cars[i][0] = position[i];
           cars[i][1] = speed[i];
        }
        Arrays.sort(cars,(a,b)->b[0]-a[0]);
        Stack<Double> s = new Stack<>();
        for(int i=0;i<n;i++)
        {
            int d = cars[i][0];
            int sp = cars[i][1];
            double t = (double)(target-d)/sp;
            if(s.isEmpty()||t>s.peek())
            {
                s.push(t);
            }
        }
        return s.size();
    }
}
