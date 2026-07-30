class Solution {
    int[][] dir ={
    {0,1},
    {1,0},
    {-1,0},
    {0,-1}
    };
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
      List<List<Integer>> l = new ArrayList<>();
        int m = heights.length;
        int n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        for(int i=0;i<m;i++)
        {
              dfs(i,0,pacific,heights);
        }
        for(int j=0;j<n;j++)
        {
          dfs(0,j,pacific,heights);
        }
        for(int i=0;i<m;i++)
        {
           dfs(i,n-1,atlantic,heights);
        }
        for(int j=0;j<n;j++)
        {
          dfs(m-1,j,atlantic,heights);
        }

        for(int i=0;i<m;i++)
        {
          for(int j=0;j<n;j++)
          {
              if(pacific[i][j]&&atlantic[i][j])
              {
                 l.add(Arrays.asList(i,j));
              }
          }
        }
        return l;
    }
    public void dfs(int i,int j,boolean[][] visited,int[][] heights)
    {
        if(visited[i][j]) return ;
        visited[i][j] = true;
        for(int[] d:dir)
        {
             int r = i+d[0];
             int c = j+d[1];
             if(r<0||c<0||r>=heights.length||c>=heights[0].length) continue;
             if(visited[r][c]) continue;
        
             if(heights[r][c]<heights[i][j])continue;
             dfs(r,c,visited,heights);
        }
    }
}
