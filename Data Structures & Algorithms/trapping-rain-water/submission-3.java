class Solution {
    public int trap(int[] height) {
        int l =0;
        int r =height.length-1;
        int l_max = 0;
        int r_max =0;
        int water=0;
        while(l<=r)
        {
            if(height[l]<height[r])
            {
                if(l_max<height[l]) 
                   l_max = height[l];
                else
                  water+= l_max - height[l];
                l++;
            }
            else{
                if(height[r]>r_max)
                     r_max = height[r];
                else
                  water+=r_max-height[r];
                r--;
            }
        }
        return water;
    }
}
