class Solution {
    public void solve(char[][] board) {
       int m = board.length;
       int n = board[0].length;
       for(int i=0;i<n;i++)
       if(board[0][i]=='O')
           dfs(0,i,board);
       for(int i=0;i<m;i++)
       if(board[i][0]=='O')
           dfs(i,0,board);
       for(int j=0;j<n;j++)
       if(board[m-1][j]=='O')
           dfs(m-1,j,board);
       for(int j=0;j<m;j++)
       if(board[j][n-1]=='O')
           dfs(j,n-1,board);

      for(int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++)
          {
               if(board[i][j]=='#')
               board[i][j]='O';
               else if(board[i][j]=='O')
               board[i][j]='X';
          }
      }
    }
    public void dfs(int i,int j,char[][] board)
    {
          if(i<0||j<0||i>=board.length||j>=board[0].length)
              return;
          if(board[i][j]!='O') return;
          board[i][j]='#';
          dfs(i+1,j,board);
          dfs(i,j+1,board);
          dfs(i-1,j,board);
          dfs(i,j-1,board);
          
    }
}
