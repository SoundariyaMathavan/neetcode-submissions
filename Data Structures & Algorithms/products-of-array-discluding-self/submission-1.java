class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int k = 0;
        for(int i=0;i<nums.length;i++)
        {
            res[i]=1;
            for(int j=0;j<nums.length;j++)
              {
                if(i==j)
                   continue;
                res[k]=res[k] * nums[j];   
              }
              k++;
        }
        return res;
    }
}  
