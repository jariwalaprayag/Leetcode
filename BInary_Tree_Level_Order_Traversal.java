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
public class Tuple{
    TreeNode node;
    int level;
    Tuple(){}
    Tuple(TreeNode node, int level){
        this.node = node;
        this.level = level;
    }
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        Queue<Tuple> queue = new LinkedList<>();
        queue.add(new Tuple(root, 0));
        while(!queue.isEmpty()){
            Tuple tuple = queue.remove();
            if(tuple.level == ans.size()){
                List<Integer> temp = new ArrayList<>();
                temp.add(tuple.node.val);
                ans.add(temp);
            }
            else
                ans.get(tuple.level).add(tuple.node.val);
            if(tuple.node.left != null)
                queue.add(new Tuple(tuple.node.left, tuple.level + 1));
            if(tuple.node.right != null)
                queue.add(new Tuple(tuple.node.right, tuple.level + 1));
        }
        return ans;
    }
}