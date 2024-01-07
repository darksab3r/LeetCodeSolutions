class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int count = 0;

        // Map to store the common differences and their counts
        Map<Integer, Integer>[] map = new HashMap[n];

        for (int i = 0; i < n; i++) {
            map[i] = new HashMap<>();

            for (int j = 0; j < i; j++) {
                long diff = (long) nums[i] - (long) nums[j];

                if (diff <= Integer.MIN_VALUE || diff > Integer.MAX_VALUE) {
                    continue;  // Skip if the difference is out of the integer range
                }

                int d = (int) diff;
                int prevCount = map[j].getOrDefault(d, 0);
                count += prevCount;  // Add the count of previous subsequences with the same difference

                // Update the count of subsequences ending at index i with difference d
                map[i].put(d, map[i].getOrDefault(d, 0) + prevCount + 1);
            }
        }

        return count;
    }
}
