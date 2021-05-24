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
    TreeNode curr = new TreeNode();
    public TreeNode increasingBST(TreeNode root) {
        TreeNode c = new TreeNode();
        c = curr;
        inOrder(root);
        return c.right;
    }
    public void inOrder(TreeNode node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        curr.right = new TreeNode(node.val);
        curr = curr.right;
        inOrder(node.right); 
    }
}