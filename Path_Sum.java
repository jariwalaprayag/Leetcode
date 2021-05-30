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
    boolean ans = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
            return false;
        calculateSum(root, 0, targetSum);
        return ans;
    }
    public void calculateSum(TreeNode node, int sum, int targetSum){
        if(node == null)
            return;
        int totalsum = sum + node.val;
        if(node.left == null && node.right == null && totalsum == targetSum)
            ans = true;
        calculateSum(node.left, totalsum, targetSum);
        calculateSum(node.right, totalsum, targetSum);
    }
}