class Solution {
     List<List<Integer>> graph;
     int[] state;
     int[] com;
     int k;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        graph =new ArrayList<>();
        state =  new int[numCourses];
        com = new int[numCourses];
        k = numCourses-1;
        for(int i=0;i<numCourses;i++)
           graph.add(new ArrayList<>());
        for(int[] n:prerequisites)
            graph.get(n[1]).add(n[0]);
        for(int i=0;i<numCourses;i++)
           if(!dfs(i))
             return new int[]{};
      return com;
    }
    public boolean dfs(int i)
    {
         if(state[i]==1) return false;
         if(state[i]==2)return true;
         state[i]=1;
         for(int n:graph.get(i))
            if(!dfs(n)) return false;
        state[i]= 2;
        com[k--] = i; 
      return true;  
    }
}
