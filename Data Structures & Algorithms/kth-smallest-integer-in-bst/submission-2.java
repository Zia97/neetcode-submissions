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
    int counter = 0;
    int foundVal = 0;

    public int kthSmallest(TreeNode root, int k) {
        if (root != null) {
            traverseNode(root, k);
        }

        return foundVal;
    }

    public void traverseNode(TreeNode node, int k) {
        if(node==null || counter >= k){
            return;
        }
        traverseNode(node.left, k);
        counter++;
        if(counter==k){
            foundVal = node.val;
            return;
        }
        traverseNode(node.right, k);
    }
}
