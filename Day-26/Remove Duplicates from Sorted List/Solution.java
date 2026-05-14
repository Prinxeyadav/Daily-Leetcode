import java.util.LinkedList;
import java.util.*;
class Solution {



    
    public ListNode deleteDuplicates(ListNode head) {
        // Start a 'current' pointer at the head of the list
        ListNode current = head;

        // Keep going until we reach the end of the list
        while (current != null && current.next != null) {
            // If the next value is a duplicate
            if (current.val == current.next.val) {
                // Skip the duplicate by pointing to the node after it
                current.next = current.next.next;
            } else {
                // No duplicate? Move the pointer forward
                current = current.next;
            }
        }

        // Return the original head (the start of the cleaned list)
        return head;
    }
}