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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.length);
    }
    public TreeNode helper(int[] nums, int l, int r){
        if(l == r)
            return null;
        int index = findMax(nums, l, r);
        TreeNode root = new TreeNode(nums[index]);
        root.left = helper(nums, l, index);
        root.right = helper(nums, index + 1, r);
        return root;
    }
    public int findMax(int[] nums, int l, int r){
        int max_index = l;
        for(int i = l; i < r; i++){
            if(nums[i] > nums[max_index])
                max_index = i;
        }
        return max_index;
    }
}