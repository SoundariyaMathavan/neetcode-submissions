class Solution {
    public boolean isAnagram(String s, String t) {
       int[] f1 = new int[26];
       if(s.length()!=t.length()) return false;
       for(int i=0;i<s.length();i++)
       {
            f1[s.charAt(i)-'a']++;
            f1[t.charAt(i)-'a']--;
       }
       for(int i=0;i<26;i++)
       {
          if(f1[i]!=0) return false;
       }
       return true;
    }
}
