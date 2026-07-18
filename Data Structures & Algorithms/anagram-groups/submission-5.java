class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s:strs)
        {
          int[] freq = new int[26];
            for(char ch:s.toCharArray())
            {
               freq[ch-'a']++;
            }
            String st = Arrays.toString(freq);

            if(!map.containsKey(st))
            {
                map.put(st,new ArrayList<>());
            }
            map.get(st).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
