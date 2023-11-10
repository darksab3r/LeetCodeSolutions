class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        return count(nums, right) - count(nums, left - 1);
    }

    private int count(int[] nums, int bound) { //returns number of subarrays having elements smaller than equal given bound
        int ans = 0, cnt = 0;
        for (int x : nums) {
            if (x <= bound) {
                cnt++;
            } else {
                cnt = 0;
            }
            ans += cnt;
        }
        return ans;
    }
}
