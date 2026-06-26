class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (p,q) -> map.get(q)-map.get(p)
        );
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        pq.addAll(map.keySet());
        int[] res = new int[k];
        for(int i=0;i<k;i++)
        {
            res[i] = pq.poll();
        }
        return res; 
    }
}
