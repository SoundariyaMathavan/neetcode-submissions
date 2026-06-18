class Solution {
    public int maxArea(int[] heights) {
        int max =0;
       for(int i=0;i<heights.length;i++)
       {
         for(int j=0;j<heights.length;j++)
         {
             int area = (j-i)*Math.min(heights[i],heights[j]);
             max = Math.max(area,max);
         }
       } 
       return max;
    }
}
