/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        if (root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int ret = 0;
        queue.add(root);
        while (queue != null){
            TreeNode node = queue.poll();
            if (node != null){
                if (node.left != null && node.left.val %2 == 0){
                    queue.add(node.left);
                }
                if (node.right != null && node.right.val %2 == 0){
                    queue.add(node.right);
                }
                ret = ret + GrandSonNode(node);
            }
        }
        return ret;
    }
    public int GrandSonNode(TreeNode node){
        if (node == null){
            return 0;
        }
        int ret = 0;
        if (node.val %2 == 0){
                int leftson = SonNode(node.left);
                int rightson = SonNode(node.right);
                ret = ret + leftson + rightson;
            }
        return ret;
    }
    public int SonNode(TreeNode node){
        if (node == null){
            return 0;
        }
        int left = 0;
        int right = 0;
        int ret = 0;
        if (node.left != null){
            left = node.left.val;
        }
        if (node.right != null){
            right = node.right.val;
        }
        ret = left + right;
        return ret;
    }
}