class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l=0;
        int r = m*n-1;
        while(l<=r)
        {
            int mid = l+(r-l+1)/2;
            int row = mid/n;
            int col = mid%n;
            int arr = matrix[row][col];
            if(target==arr)return true;
            else if(target>arr) l =mid+1;
            else r = mid-1;
        }
        return false;
    }
}
