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
    int maxdepth = 0;
    public int maxDepth(Node root) {
        if(root == null)
            return maxdepth;
        countMaxDepth(root, 0);
        return maxdepth;
    }
    public void countMaxDepth(Node node, int depth){
        if(node == null)
            return;
        int currdepth = depth + 1;
        int flag = 0;
        for(int i = 0; i < node.children.size(); i++){
            if(node.children.get(i) != null)
                flag = 1;
        }
        if(flag == 0){
            maxdepth = Math.max(maxdepth, currdepth);
            return;
        }
        else{
            for(int i = 0; i < node.children.size(); i++){
                countMaxDepth(node.children.get(i), currdepth);
            } 
        }
        return;      
    }
}