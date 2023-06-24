package Blind75.LinkedList;

public class Main {
    public static void main(String[] args) {
        ReverseLinkedList solution1 = new ReverseLinkedList();
        LinkedList linkedList = new LinkedList();
        int[] nodePayload = {-3, 0, 1, 2, 3, 4, 5};
        ListNode head = linkedList.createLinkedList(nodePayload);
        
        ListNode current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }

        System.out.println(solution1.reverseList(head));
    }
}
