class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1') {count++;
                bfs(grid,i,j);
                }
            }
        }
        return count;
    }
    public void bfs(char[][] grid,int i,int j)
    {
        if(i>=grid.length ||j>=grid[0].length||i<0||j<0||grid[i][j]=='0') return;
        grid[i][j]='0';
        bfs(grid,i+1,j);
        bfs(grid,i,j+1);
        bfs(grid,i-1,j);
        bfs(grid,i,j-1);
    }
}
