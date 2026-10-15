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
    public TreeNode invertTree(TreeNode root) {
        inOrder(root);
        return root;
    }

    public void inOrder(TreeNode node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        inOrder(node.right);
        swapNode(node);
    }


    public void swapNode(TreeNode node){
        TreeNode originalLeft = node.left;
        TreeNode originalRight = node.right;
        node.left = originalRight;
        node.right = originalLeft;
    }
}
