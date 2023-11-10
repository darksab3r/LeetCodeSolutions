class Solution {
    // this can be done with modified kadane's algo
    public int maxSubarraySumCircular(int[] nums) {

        int totalSum=0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        int currentMax = 0;
        int currentMin = 0;

        for(int num: nums){
            currentMax = Math.max(currentMax + num, num);
            currentMin = Math.min(currentMin + num, num);
            minSum = Math.min(currentMin,minSum);
            maxSum = Math.max(currentMax,maxSum);
            totalSum+=num;
        }

        return maxSum>0 ? Math.max(maxSum,totalSum-minSum):maxSum;
    }
}