class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro = 1;
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            res[i]=pro;
            pro*=nums[i];
        }
        int pos = 1;
        for(int i=nums.length-1;i>=0;i--)
        {
            res[i]*=pos;
            pos*=nums[i];
        }
        return res;
    }
}  
