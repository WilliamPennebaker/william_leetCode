



/**
 * Submitted: 09/28/2022
 * 
 * Merge Two Sorted Lists
 * You are given the heads of two sorted linked lists list1 and list2
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 */
public class mergeTwoSortedListsIter {
    public static void main(String[] args) {
        
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode preHead = new ListNode(1);     // Dummy node to track the first elem in merge list
        ListNode last = preHead;

        while (list1 != null && list2 != null) {
            if(list1.val > list2.val) {             // Comparing nodes
                last.next = list2;
                list2 = list2.next;
            } else {
                last.next = list1;
                list1 = list1.next;
            }
            last = last.next;
        }

        if(last.next == list1 && list1 == null) last.next = list2; // Incase list1 finishes first, add list2 to merged list
        else last.next = list1; // Same here but for list2 finishing first

        return preHead.next; // Return head of the merged list, preHead.next since first node is a dummy
    }
}
