package Blind75.LinkedList;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slowPointer = head;
        ListNode fastPointer = head.next;

        while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
            if (slowPointer == fastPointer) {
                return true;
            }

            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return false;

    }
}
