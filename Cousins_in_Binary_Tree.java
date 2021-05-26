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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null || x == y){
            return false;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            Set<Integer> set = new HashSet<>();
            int len = que.size();
            for(int i = 0; i < len; i++){
                TreeNode node = new TreeNode();
                node = que.remove();
                set.add(node.val);
                if(node.left != null)
                    que.add(node.left);
                if(node.right != null)
                    que.add(node.right);
                if(node.left != null && node.right != null){
                    if((node.left.val == x && node.right.val == y) || (node.left.val == y && node.right.val == x))
                        return false;
                }
            }
            if(set.contains(x) && set.contains(y))
                return true;
        }
        return false;
    }
}