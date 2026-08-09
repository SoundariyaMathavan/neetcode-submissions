class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums)
           set.add(num);
        int max= 0;
        for(int n:set)
        {
            if(!set.contains(n-1))
            {
                int len =1;
                while(set.contains(++n))
                {
                    len++;
                }
                max = Math.max(len,max);
            }
        }
        return max;
    }

}
