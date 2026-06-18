class Solution {

    public String encode(List<String> strs) {
         StringBuilder s  = new StringBuilder();
         for(String st:strs)
           s.append(st.length()).append('#').append(st);
        return s.toString();
    }

    public List<String> decode(String str) {
        int i=0;
        List<String> l = new ArrayList<>();
        while(i<str.length())
        {
            int j =i;
            while(str.charAt(j)!='#')  j++;
            int len = Integer.parseInt(str.substring(i,j));
            j++;
            i = j+len;
            l.add(str.substring(j,j+len));
         }
         return l;
    }
}
