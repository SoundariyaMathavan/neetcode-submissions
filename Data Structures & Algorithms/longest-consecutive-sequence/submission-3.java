class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n:nums)
           set.add(n);
        int max =0;
        for(int n:set)
        {
            if(set.contains(n-1))
            {
                 continue;
            }
            if(!set.contains(n-1))
            {           
                 int i =1;
                int num = n;
                while(set.contains(num+1))
                {   
                    i++;
                    num++;
                }
                max =Math.max(i,max);
            }

        }
        return max;
    }
}
