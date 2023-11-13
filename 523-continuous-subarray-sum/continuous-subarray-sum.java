class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        // Map to store remainder and its corresponding index
        Map<Integer, Integer> remainderMap = new HashMap<>();
        int runningSum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            runningSum = (nums[i]+runningSum)%k;
            // If k is not zero, take modulo of running sum with k
            if(runningSum%k==0 && i>0){
                System.out.print(i);
                return true;
            }
            // If the remainder is already in the map, check if the subarray has length >= 2

            if (remainderMap.containsKey(runningSum)) {
                int prevIndex = remainderMap.get(runningSum);

                // Check if the subarray has at least length 2
                if (i - prevIndex >=2){ //length of prevIndex+1 to i = i-(prevIndex+1)+1 
                    return true;
                }
            } else {
                // If the remainder is not in the map, add it along with its index
                remainderMap.put(runningSum, i);
            }
        }

        return false;
    }

}

