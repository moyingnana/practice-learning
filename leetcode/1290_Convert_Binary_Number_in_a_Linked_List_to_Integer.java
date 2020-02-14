/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        if (head == null){
            return 0;
        }
        int ret = 0;
        ListNode node = head;
        while (node != null){
            ret = ret * 2 + node.val;
            node = node.next;
        }
        return ret;
    }
}