class Solution {
     int[] state;
    List<List<Integer>> graph;
    int[] com;
    int k=0;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        graph = new ArrayList<>();
        com = new int[numCourses];
        k = numCourses-1;
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
               return new int[]{};
        }
        return com;
    }
    public boolean dfs(int course)
    {
         if(state[course]==1) 
            return false;
        if(state[course]==2) return true;
         state[course]=1;
         for(int n:graph.get(course))
         {
            if(!dfs(n))
               return false;
         }
         state[course]=2;
         com[k--]=course;
         return true;
    }
}

