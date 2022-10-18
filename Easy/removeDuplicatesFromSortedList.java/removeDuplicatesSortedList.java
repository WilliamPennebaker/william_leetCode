
/**
 * Submitted: 09/12/2022
 * 
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 * 
 * Constraints:
 *      The number of nodes in the list is in the range [0, 300].
 *      -100 <= Node.val <= 100
 *      The list is guaranteed to be sorted in ascending order.
 */

public class removeDuplicatesSortedList {
    
    public static void main(String[] args) {
        /**
         * Example 1
         * Input: head = [1,1,2]
         * Output: [1,2]
         */

        /**
         * Example 2
         * Input: head = [1,1,2,3,3]
         * Output: [1,2,3]
         */
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current_node = head; // set a node equal to head so we dont change head val

        while (current_node != null || current_node.next != null) { // we want to loop until the end of the linkedList
            // if our next nodes val is equal to the current nodes val then we found a dupe
            // we replace the dupe by changing the next node to the next next node
            if (current_node.next.val == current_node.val) current_node.next = current_node.next.next;
            // else no dupe and just move to the next node
            else current_node = current_node.next;
        }
        // return the head
        return head;
    }
}
