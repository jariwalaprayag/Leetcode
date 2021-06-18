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
    int ans = 0;
    public int sumEvenGrandparent(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if(root != null)
            stack.add(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.val % 2 == 0){
                if(node.left != null){
                    if(node.left.left != null)
                        ans += node.left.left.val;
                    if(node.left.right != null)
                        ans += node.left.right.val;
                }
                if(node.right != null){
                    if(node.right.left != null)
                        ans += node.right.left.val;
                    if(node.right.right != null)
                        ans += node.right.right.val;
                }
            }
            if(node.right != null){
                stack.add(node.right);
            }
            if(node.left != null){
                stack.add(node.left);
            }
        }
        return ans;
    }
}