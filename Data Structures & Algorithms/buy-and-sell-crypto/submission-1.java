class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprice = 0;
        for(int n:prices)
        {
            minprice = Math.min(n,minprice);
            maxprice= Math.max(maxprice,n-minprice);
        }
        return maxprice;
    }
}
