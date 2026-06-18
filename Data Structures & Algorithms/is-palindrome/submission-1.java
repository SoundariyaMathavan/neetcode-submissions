class Solution {
    public boolean isPalindrome(String s) {
        String t = s.trim();
        int l = 0;
        int r= t.length()-1;

        while(l<r)
        {
            while(l<r&&!Character.isLetterOrDigit(s.charAt(l)))
            {
                l++;
            }
            while(l<r&&!Character.isLetterOrDigit(s.charAt(r)))
            {
                r--;
            }
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r)))
            {
                return false;
            }
            r--;
            l++;
        }
        return true;
    }
}
