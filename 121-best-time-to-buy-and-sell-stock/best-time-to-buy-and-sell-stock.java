class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n<2) return 0;
        int maximumProfix=Integer.MIN_VALUE;
        int maxRight=prices[n-1];
        for(int i=n-2;i>=0;i--){
            maximumProfix = Math.max(maximumProfix,maxRight-prices[i]);
            maxRight = Math.max(prices[i],maxRight);
        }

        if(maximumProfix<=0) return 0;

        return maximumProfix;
    }
}