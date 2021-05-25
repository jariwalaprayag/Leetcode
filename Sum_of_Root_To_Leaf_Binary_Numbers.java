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
    int sum = 0;
    public int sumRootToLeaf(TreeNode root) {
        if(root == null)
            return sum;
        countsum(root, "");
        return sum;
    }
    public void countsum(TreeNode node, String binary){
        if (node == null){
            return;
        }
        String currBinary = binary + node.val;
        if(node.left == null && node.right == null){
            sum += Integer.parseInt(currBinary, 2);
            return;
        }
        countsum(node.left, currBinary);
        countsum(node.right, currBinary);
        return;
    }
}