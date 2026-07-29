class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max =0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                   int area = bfs(grid,i,j);
                   max = Math.max(area,max);   
                }
            }
        }
        return max;
    }
    public int bfs(int[][] grid,int i,int j)
    {
        int area=1;
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==0)
           return 0;
        grid[i][j]=0;
        area+=bfs(grid,i+1,j);
        area+=bfs(grid,i-1,j);
        area+=bfs(grid,i,j-1);
        area+=bfs(grid,i,j+1);
        return area;
    }
}                   
