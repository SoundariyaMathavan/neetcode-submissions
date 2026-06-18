class Solution {
    public int longestConsecutive(int[] nums) {
     HashSet<Integer> set = new HashSet<>();
     for(int n:nums)
     {
       set.add(n);
     }
     int l=0;
     for(int n: set)
     {
        if(!set.contains(n-1))
        {
           int length =1;
           int curr =n;
           while(set.contains(curr+1))
           {
            length++;
            curr++;
           }
          l= Math.max(l,length);
        }
     }   
     return l;
    }
}
