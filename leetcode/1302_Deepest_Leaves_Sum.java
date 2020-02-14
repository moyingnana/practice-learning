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
    public int maxdepth = 0;
    List<TreeNode> list = new ArrayList<TreeNode>();
    public int deepestLeavesSum(TreeNode root) {
        if(root == null){
            return ret;
        }
        int depth = 0;
        findleave(root, depth);
        int ret = 0;
        for (int i = 0; i < list.size(); i++) {
			ret = ret + list.get(i).val;
		}

    }
    public void findleave(TreeNode node, int depth) {
        if (node == null){
            return;
        }
        if (depth == maxdepth){
            list.add(node);
        }
        if (depth > maxdepth){
            list.clear();
            maxdepth = depth;
            list.add(node);
        }
        findleave(node.left, depth + 1);
        findleave(node.right, depth + 1);
    }
}