class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char ch = board[i][j];
                if(ch=='.') continue;
                String rowkey = ch+"row"+i;
                String colkey = ch+"col"+j;
                String box = ch+"box"+(i/3)+(j/3);
                if(set.contains(rowkey)||set.contains(colkey)||set.contains(box)) 
                {
                    return false;
                }
                set.add(rowkey);
                set.add(colkey);
                set.add(box);
            }
        }
        return true;
    }
}
