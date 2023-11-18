class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        
        int reqSum = 0;
        for (int i = 0; i < nums.size(); i++) {
            int setBits = 0;
            int n = i;
            while (n > 0) {
                if ((n & 1) == 1) {
                    setBits++;
                }
                n >>= 1;
            }
            if (setBits == k) {
                reqSum += nums.get(i);
            }
        }

        return reqSum;
    }
}
