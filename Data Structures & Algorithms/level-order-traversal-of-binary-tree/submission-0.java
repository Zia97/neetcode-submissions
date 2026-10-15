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
    List<List<Integer>> results = new ArrayList<>();
    Queue<TreeNode> queue = new ArrayDeque<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return results;
        }

        queue.offer(root);

        traverseNode(queue);

        return results;
    }

    public void traverseNode(Queue<TreeNode> queue) {
        Queue<TreeNode> nextLevelQueue = new ArrayDeque<>();
        List<Integer> values = new ArrayList<>();

        while (queue.size() > 0) {
            TreeNode temp = queue.peek();
            if (temp.left != null) {
                nextLevelQueue.add(temp.left);
            }
            if (temp.right != null) {
                nextLevelQueue.add(temp.right);
            }
            values.add(temp.val);
            queue.poll();
        }

        results.add(values);
        queue = nextLevelQueue;

        if (!queue.isEmpty()) {
            traverseNode(queue);
        }
    }
}
