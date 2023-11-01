class Solution {
    int prevValue; // Track the previous value during in-order traversal
    int currentCount; // Track the count of the current value
    int maxCount; // Track the maximum count
    ArrayList<Integer> modes; // List to store the modes

    public void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);

        // Update the count for the current value
        if (root.val == prevValue) {
            currentCount++;
        } else {
            prevValue = root.val;
            currentCount = 1;
        }

        // If the current count is greater than or equal to the max count, update the modes
        if (currentCount >= maxCount) {
            if (currentCount > maxCount) {
                modes = new ArrayList<>();
                maxCount = currentCount;
            }
            modes.add(root.val);
        }

        inOrder(root.right);
    }

    public int[] findMode(TreeNode root) {
        prevValue = Integer.MIN_VALUE; // Initialize prevValue with a value that won't appear in the tree
        currentCount = 0;
        maxCount = 0;
        modes = new ArrayList<>();

        inOrder(root);

        int[] answerArray = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            answerArray[i] = modes.get(i);
        }

        return answerArray;
    }
}