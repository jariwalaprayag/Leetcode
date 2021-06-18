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
    int max_depth = 0;
    int sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        helper(root, 1);
        return sum;
    }
    public void helper(TreeNode root, int height){
        if(root == null){
            return;
        }
        helper(root.left, height + 1);
        if(height == max_depth)
            sum += root.val;
        if(height > max_depth){
            max_depth = height;
            sum = root.val;
        }
        helper(root.right, height + 1);
    }
}