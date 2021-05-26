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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null)
            return true;
        if((root1 == null && root2 != null) || (root1 != null && root2 == null))
            return false;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        
        stack1.add(root1);
        stack2.add(root2);
        
        while(!stack1.isEmpty()){
            TreeNode node = new TreeNode();
            node = stack1.pop();
            if(node.left == null && node.right == null)
                l1.add(node.val);
            if(node.right != null)
                stack1.add(node.right);
            if(node.left != null)
                stack1.add(node.left);
        }
        while(!stack2.isEmpty()){
            TreeNode node = new TreeNode();
            node = stack2.pop();
            if(node.left == null && node.right == null)
                l2.add(node.val);
            if(node.right != null)
                stack2.add(node.right);
            if(node.left != null)
                stack2.add(node.left);
        }
        return l1.equals(l2);
    }
}