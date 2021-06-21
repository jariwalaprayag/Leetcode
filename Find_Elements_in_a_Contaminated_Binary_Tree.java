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
class FindElements {
    HashSet<Integer> elements = new HashSet<>();
    
    public FindElements(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        root.val = 0;
        elements.add(0);
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.right != null){
                node.right.val = (node.val * 2) + 2;
                elements.add(node.right.val);
                stack.add(node.right);
            }
            if(node.left != null){
                node.left.val = (node.val * 2) + 1;
                elements.add(node.left.val);
                stack.add(node.left);
            }
        }
    }
    
    public boolean find(int target) {
        if(elements.contains(target))
            return true;
        return false;
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */