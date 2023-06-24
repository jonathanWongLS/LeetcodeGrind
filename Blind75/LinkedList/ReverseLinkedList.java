package Blind75.LinkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        ListNode prevNode = null;
        ListNode currentNode = head;
        ListNode nextNode = null;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head = prevNode;
        
        return head;
    }
}
