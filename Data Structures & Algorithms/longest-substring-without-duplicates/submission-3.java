class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
       
        int i =0;
        int max =0;
      for(int j=0;j<s.length();j++)
        {
             while(set.contains(s.charAt(j)))
             {
              set.remove(s.charAt(i));
              i++;
             }
             max = Math.max(max,j-i+1);
             set.add(s.charAt(j));
         
        }
        return max;
    }
}
