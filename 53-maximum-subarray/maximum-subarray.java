class Solution {
    public int maxSubArray(int[] nums) {

        int sum=0;
        int n=nums.length;
        int maxSum=Integer.MIN_VALUE;
        int maxValue=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            sum+=nums[i];
            maxSum=Math.max(sum,maxSum);
            maxValue=Math.max(nums[i],maxValue);
            if(sum<0)sum=0;
        }

        if(maxSum>=0)return maxSum;
        return maxValue;
    }
}