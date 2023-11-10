class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int MOD = 1000000007;
        long result = 0;

        // Step 1: Calculate contribution of each element
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();

        // left : nearest smallest element in the left 
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                left[i] = stack.peek() + 1; //we'll store peek() Index+1 instead of peek() index so as to avoid including the extra case for last index => dry run 5 1 6
            } else {
                left[i] = 0;
            }

            stack.push(i);
        }

        stack.clear();

        //right : nearest smallest element in the right
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                right[i] = stack.peek() - 1;//we'll store peek() Index-1 instead of peek() index so as to avoid including the extra case for last index => dry run 5 1 6
            } else {
                right[i] = n - 1;
            }

            stack.push(i);
        }

        // Step 2: Compute the sum of contributions
        for (int i = 0; i < n; i++) {
            result = (result + (long) arr[i] * (i - left[i] + 1) * (right[i] - i + 1)) % MOD;
        }

        return (int) result;
    }
}