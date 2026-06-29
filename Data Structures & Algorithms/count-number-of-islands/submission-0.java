class Solution {
    public int numIslands(char[][] grid) {
        int count =0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1'){ 
                 count++;
                 bfs(grid,i,j);
                }
            }
        }
        return count;
    }
    public static void bfs(char[][] grid,int row,int col)
    {
        if(row<0||col<0||row>=grid.length||col>=grid[0].length||grid[row][col]=='0') return;
        grid[row][col] = '0';
        bfs(grid,row+1,col);
        bfs(grid,row,col+1);
        bfs(grid,row-1,col);
        bfs(grid,row,col-1);
    }
}
