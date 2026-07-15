class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> a = new ArrayList<>();
        int n = nums.length;
        int s = 1<<n;
        for(int i=0;i<s;i++)
        {
            List<Integer> m = new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if((i&(1<<j))!=0)
                {
                    m.add(nums[j]);
                }
            }
            a.add(m);
        }
        return a;
    }
}
