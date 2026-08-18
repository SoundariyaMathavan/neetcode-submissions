class Solution {
    public int search(int[] nums, int target) {
        int l =0;
        int r = nums.length-1;
        while(l<=r)
        {
            int mid = l+(r-l+1) /2 ;
            int value  = nums[mid];
            if(target==value) return mid;
            else if(target>value) l = mid+1;
            else
             r= mid-1;
        }
        return -1;
    }
}
