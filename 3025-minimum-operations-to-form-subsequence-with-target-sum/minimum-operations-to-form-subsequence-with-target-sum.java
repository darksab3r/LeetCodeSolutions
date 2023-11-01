import java.util.Arrays;
import java.util.List;

class Solution {
    public int minOperations(List<Integer> nums, int target) {
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        
        if (sum < target) {
            return -1;
        }
        
        int n = nums.size(), ops = 0;
        nums.sort(null);
        
        for (int i = n - 1; i >= 0; i--) {
            sum -= nums.get(i);
            
            while (sum < target) {
                while (nums.get(i) > target) {
                    nums.set(i, nums.get(i) / 2);
                    ops++;
                }
                target -= nums.get(i);
            }
        }
        
        return ops;
    }
}