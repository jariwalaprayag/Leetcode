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
    List<String> res = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        paths(root, new StringBuilder());
        return res;
    }
    public void paths(TreeNode node, StringBuilder sb){
        if(node == null)
            return;
        if(node.left == null && node.right == null){
            sb.append(node.val);
            res.add(sb.toString());
            return;
        }
        sb.append(node.val);
        sb.append("->");
        paths(node.left, new StringBuilder(sb));
        paths(node.right, new StringBuilder(sb));
    }
}