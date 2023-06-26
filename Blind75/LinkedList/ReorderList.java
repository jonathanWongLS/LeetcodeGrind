package Blind75.LinkedList;

public class ReorderList {
    public void reorderList(ListNode head) {
        ListNode headRight = null;

        // 1. Find middle of linked list with slow and fast pointer
        ListNode middleNode = head;
        ListNode fastPointer = head.next;

        while (fastPointer != null && fastPointer.next != null) {
            middleNode = middleNode.next;
            fastPointer = fastPointer.next.next;
        }

        // 2. Reverse linked list on the right
        ListNode prevNode = null;
        ListNode currentNode = middleNode.next; 
        ListNode nextNode = null;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode; 
        }
        headRight = prevNode;

        // Set last node's next node for list on the left to null 
        middleNode.next = null;

        // 3. Link nodes by taking turns in linking nodes in both linked lists
        ListNode nextLeft = null;
        ListNode nextRight = null;
        currentNode = head;

        while (head != null && headRight != null) {
            
            nextLeft = head.next;
            nextRight = headRight.next;

            currentNode.next = headRight;
            currentNode = currentNode.next;

            head = nextLeft;
            headRight = nextRight;

            currentNode.next = head;
            currentNode = currentNode.next;
            
        }

    }
}
