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
    public int ret = 0;
    public int sumEvenGrandparent(TreeNode root) {
        if (root == null){
            return 0;
        }
        Grandparent(root);
        return ret;
    }
    public void Grandparent(TreeNode node){
        if (node == null){
            return;
        }
        if (node.val %2 == 0){
                int leftson = SonNode(node.left);
                int rightson = SonNode(node.right);
                ret = ret + leftson + rightson;
            }
        Grandparent(node.left);
        Grandparent(node.right);
    }
    public int SonNode(TreeNode node){
        if (node == null){
            return 0;
        }
        int left = 0;
        int right = 0;
        int sum = 0;
        if (node.left != null){
            left = node.left.val;
        }
        if (node.right != null){
            right = node.right.val;
        }
        sum = left + right;
        return sum;
    }
}