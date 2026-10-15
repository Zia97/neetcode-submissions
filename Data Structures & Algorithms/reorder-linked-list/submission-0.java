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
    public void reorderList(ListNode head) {
        List<ListNode> nodes = new ArrayList<ListNode>();

        ListNode dummy = head;

        while (dummy != null) {
            nodes.add(dummy);
            dummy = dummy.next;
        }

        int counterBack = 0;
        int counterFront = 1;

        for (int i = 0; i < nodes.size(); i++){
            if (head != null) {
                if ((i + 1) % 2 != 0) {
                    head.next = nodes.get(nodes.size() - (counterBack + 1));
                    counterBack++;
                } else {
                    head.next = nodes.get(counterFront);
                    counterFront ++;
                }

                
                if(i+1==nodes.size()){
                    head.next = null;
                }

                head = head.next;


            }
        }

    }
}
