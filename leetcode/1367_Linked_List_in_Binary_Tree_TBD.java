/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public boolean isSubPath(ListNode head, TreeNode root) {
      ListNode list = new ListNode<>();
      TreeNode tree = new TreeNode<>();
      list = head;
      tree = root;
      int pathn = 0;
      path(list, tree);
      if(pathn > 0){
          return true;
      }else{
          return false;
      }
    }
    public void path(ListNode list, TreeNode tree){
        if(list == null){
            pathn++;
            return;
        }
        if(tree == null){
            return;
        }
        if(list.val == tree.val){
            list = list.next;
            path(list, tree.left);
            path(list, tree.right);
        }else{
            path(list, tree.left);
            path(list, tree.right);
        }
    }
}