class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       for(int n:nums)
       {
         set.add(n);
       }
       int l=0; 
       for(int n:nums)
       {
          if(!set.contains(n-1))
          {
            int len = 1;
            int curr = n;
             while(set.contains(curr+1))
             {
                len++;
                curr++;
             }
            l = Math.max(l,len);  
          }
       }
       return l;
    }
}
