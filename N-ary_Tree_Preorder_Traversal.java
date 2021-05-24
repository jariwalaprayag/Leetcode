/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<Integer>();
        if (root == null)
            return ans;
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            Node node = new Node();
            node = stack.pop();
            ans.add(node.val);
            int len = node.children.size();
            for (int i = len - 1; i >= 0; i--){
                stack.add(node.children.get(i));
            }
        }
        return ans;
    }
}