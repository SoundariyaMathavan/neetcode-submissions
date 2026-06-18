class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int row =0;row <9;row++)
        {
            for(int col=0;col<9;col++)
            {
                char curr = board[row][col];
                if(curr=='.') continue;
                String rowkey = curr+"row"+row;
                String colkey = curr+"col"+col;
                String box = curr+"box"+(row/3)+(col/3);
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
