class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer>  window = new HashMap<>();
        for(char ch:t.toCharArray())
        {
            need.put(ch,need.getOrDefault(ch,0)+1);
        }
        int have =0;
        int required = need.size();
        int  start =0;
        int l=0; 
        int min = Integer.MAX_VALUE;
        for(int r=0;r<s.length();r++)
        {
            char c = s.charAt(r);
            window.put(c,window.getOrDefault(c,0)+1);
            if(need.containsKey(c) && window.get(c).equals(need.get(c))) have++;
            while(have==required)
            {
                if(r-l+1 <min)
                {
                    min = r-l+1;
                    start=l;   
                }
                char x = s.charAt(l);
                window.put(x,window.get(x)-1);
                if(need.containsKey(x) && need.get(x)>window.get(x))
                {
                    have--;
                }
                l++;
            }
        }
        return min<Integer.MAX_VALUE ? s.substring(start,start+min):"";
    }
}
