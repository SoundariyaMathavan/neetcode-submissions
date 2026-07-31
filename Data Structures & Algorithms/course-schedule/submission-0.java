class Solution {
    int[] state;
    List<List<Integer>> graph;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {
           graph.add(new ArrayList<>());
        }
         state = new int[numCourses];
        for(int[] p:prerequisites)
         graph.get(p[1]).add(p[0]);
        for(int i=0;i<numCourses;i++)
        {
              if(!dfs(i))
                return false;
        }
        return true;
    }
    public boolean dfs(int course)
    {
         if(state[course]==1) 
            return false;
         if(state[course]==2) 
           return true;
         state[course]=1;
         for(int n:graph.get(course))
         {
             if(!dfs(n))
               return false;
         }
         state[course]=2;
    return true;
    }
}
