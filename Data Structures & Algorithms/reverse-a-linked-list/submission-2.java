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
                currentNode.next = previousNode; // the first nodes "next" now goes to the previous node (null in this case as start of linked list)
                previousNode = currentNode; // the "previous node" now beomces first node in list (and points back to null)
                currentNode = nextNode; // current node goes next in the previous continuing chain
                nextNode = currentNode.next; // next node moves forward 
                currentNode.next = previousNode;// new current node now needs to point at the previous node 
            }
        }
    
        return currentNode;

    }
}
