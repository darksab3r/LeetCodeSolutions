import java.util.Arrays;

class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][3];

        for (int i = 0; i < n; i++) {
            jobs[i] = new int[]{startTime[i], endTime[i], profit[i]};
        }

        // Sort jobs based on end times
        Arrays.sort(jobs, (a, b) -> a[1] - b[1]);

        int[] dp = new int[n];
        dp[0] = jobs[0][2];

        for (int i = 1; i < n; i++) {
            int currentProfit = jobs[i][2];
            int prevNonOverlapIndex = binarySearch(jobs, i);
            if (prevNonOverlapIndex != -1) {
                currentProfit += dp[prevNonOverlapIndex];
            }
            dp[i] = Math.max(currentProfit, dp[i - 1]);
        }

        return dp[n - 1];
    }

    private int binarySearch(int[][] jobs, int index) {
        int low = 0, high = index - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (jobs[mid][1] <= jobs[index][0]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Return the index of the last non-overlapping job found (or -1 if none)
        return (high >= 0) ? high : -1;
    }
}
