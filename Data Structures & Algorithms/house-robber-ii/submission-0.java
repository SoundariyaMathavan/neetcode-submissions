class Solution {
    public int helper(int start,int end,int[] nums)
    {
        int  a =0;
        int b =0;
        int c =0;
        for(int i=start;i<=end;i++)
        {
            c = Math.max(b,a+nums[i]);
            a = b;
            b= c;
        }
        return b;
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int ans1 = helper(0,nums.length-2,nums);
        int ans2 = helper(1,nums.length-1,nums);
       return Math.max(ans1,ans2);
    }
}
