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
    public ListNode reverseList(ListNode head) {
            ListNode currentNode = head;  

        if(head!=null){
            ListNode previousNode = null;
            ListNode nextNode = currentNode.next;  

            while(nextNode!=null){
                currentNode.next = previousNode;
                previousNode = currentNode;
                currentNode = nextNode;
                nextNode = currentNode.next;
                currentNode.next = previousNode;
            }
        }
    
        return currentNode;

    }
}
