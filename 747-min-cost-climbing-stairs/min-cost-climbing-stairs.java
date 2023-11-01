class Solution {
    // element of choice : take one or two steps
    // state of dp: dp[i] = cost of reaching the ith state
    // recursive rel = dp[i] = min(cost[i-1]+d[i-1],cost[i-2]+dp[i-2])
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int [] dp = new int [n+1];
        //base cases
        dp[0]=0;
        dp[1]=0;
        for(int i=2;i<=n;i++){
            dp[i] = Math.min(cost[i-1]+dp[i-1],cost[i-2]+dp[i-2]);
        }
        return dp[n];
    }
}