/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode counterNode = head;

        int counter = 0;

        while (counterNode != null) {
            counter++;
            counterNode = counterNode.next;
        }

        if (counter == n) {
            return head.next;
        }

        int nodePositionToRemove = counter - n;

        counter = 0;

        ListNode newHead = head;

        while (counter < nodePositionToRemove - 1) {
            newHead = newHead.next;
            counter++;
        }

         newHead.next = newHead.next.next;

        return head;
    }
}
