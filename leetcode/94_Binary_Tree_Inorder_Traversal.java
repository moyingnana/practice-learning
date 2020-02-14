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
    public List<Integer> ret = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return ret;
    }
    public void inorder(TreeNode node){
        if (node == null){
            return;
        }
        inorder(node.left);
        ret.add(node.val);
        inorder(node.right);
    }
}