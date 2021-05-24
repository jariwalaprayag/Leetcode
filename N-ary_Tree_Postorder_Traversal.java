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
    List<Integer> ans = new ArrayList<Integer>();
    public List<Integer> postorder(Node root) {
        if(root == null)
            return ans;
        PostOrder(root);
        return ans;
    }
    public void PostOrder(Node node){
        if (node == null)
            return;
        for(int i = 0; i < node.children.size(); i++){
            PostOrder(node.children.get(i));
        }
        ans.add(node.val);
    }
}