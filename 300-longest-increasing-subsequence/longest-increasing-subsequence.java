class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
        int dp[] = new int[n];
        int answer = 1;

        Arrays.fill(dp,1);

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]<nums[j]){
                    dp[j] = Math.max(dp[i]+1,dp[j]);
                    answer = Math.max(answer,dp[j]);
                }
            }
        }
        return answer;
    }
}