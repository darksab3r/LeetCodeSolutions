/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum;
    int low;
    int high;
    public int rangeSumBST(TreeNode root, int low, int high) {
        this.sum=0;
        this.low = low;
        this.high = high;
        inOrder(root);
        return sum;
    }
    private void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        int val = root.val;
        if(val>=low && val<=high){
            sum+=val;
            inOrder(root.left);
            inOrder(root.right);
        }
        else if(val<low){
            inOrder(root.right);
        }
        else{
            inOrder(root.left);
        }
    }
}