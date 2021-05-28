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
    int min = Integer.MAX_VALUE;
    int last = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        if(root == null)
            return min;
        inorder(root);
        return min;
    }
    public void inorder(TreeNode node){
        if(node == null)
            return;
        inorder(node.left);
        min = Math.min(min, Math.abs(last - node.val));
        last = node.val;
        inorder(node.right);
    }
}