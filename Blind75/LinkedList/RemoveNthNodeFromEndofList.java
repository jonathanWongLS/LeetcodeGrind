package Blind75.LinkedList;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head.next == null && n == 1) {
            return null;
        }

        // 1. Place first pointer at head, second pointer at the Nth node from the start
        ListNode firstPointer = head;
        ListNode secondPointer = head;
        int i = 1;

        while (i < n) {
            secondPointer = secondPointer.next;
            i++;
        }

        // 2. Traverse one node per time in the linked list until second pointer points to or its next node is a null node
        ListNode prevNode = firstPointer;

        while (secondPointer != null && secondPointer.next != null) {
            prevNode = firstPointer;
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }

        if (firstPointer == head) {
            return firstPointer.next;
        }
        else {
            // 3. Remove the node pointed to by first pointer (Nth node from the end)
            prevNode.next = firstPointer.next;
        }
        
        return head;
    }
}

