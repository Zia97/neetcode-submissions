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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode smaller;
        TreeNode bigger;

        if (p.val < q.val) {
            smaller = p;
            bigger = q;
        } else if (p.val > q.val) {
            smaller = q;
            bigger = p;
        } else {
            return p;
        }

        while (root != null) {
            if (smaller.val > root.val && bigger.val > root.val) {
                root = root.right;
            } else if(smaller.val < root.val && bigger.val < root.val) {
                root = root.left;
            }
            else{
                return root;
            }
        }

        return root;
    }
}
