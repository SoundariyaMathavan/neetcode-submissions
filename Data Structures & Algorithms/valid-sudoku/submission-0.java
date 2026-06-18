class Solution {

    public boolean isValidSudoku(char[][] board) {

        java.util.HashSet<String> set =
                new java.util.HashSet<>();

        for(int row = 0; row < 9; row++) {

            for(int col = 0; col < 9; col++) {

                char current = board[row][col];

                if(current == '.') {
                    continue;
                }

                String rowKey =
                        current + "row" + row;

                String colKey =
                        current + "col" + col;

                String boxKey =
                        current + "box" +
                        (row / 3) + "-" +
                        (col / 3);

            
                if(set.contains(rowKey) ||
                   set.contains(colKey) ||
                   set.contains(boxKey)) {

                    return false;
                }

                set.add(rowKey);
                set.add(colKey);
                set.add(boxKey);
            }
        }

        return true;
    }
}