class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
       
        int j =0;
        int max =0;
        int ans =0;
        for(int right=0;right<s.length();right++)
        {
            freq[s.charAt(right)-'A']++;
            max = Math.max(max,freq[s.charAt(right)-'A']);
            while((right-j+1) -max >k)
            {
                 freq[s.charAt(j)-'A']--;
                 j++;
            } 
            ans = Math.max(ans,right-j+1);
        }
        return ans;
    }
}
