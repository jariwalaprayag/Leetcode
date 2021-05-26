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
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        Queue<TreeNode> que = new LinkedList<>();
        int depth = 1;
        que.add(root);
        while(!que.isEmpty()){
            int len = que.size();
            for(int i = 0; i < len; i++){
                TreeNode node = new TreeNode();
                node = que.remove();
                if(node.left == null && node.right == null)
                    return depth;
                if(node.left != null)
                    que.add(node.left);
                if(node.right != null)
                    que.add(node.right);
            }
            depth++;
        }
        return depth;
    }
}