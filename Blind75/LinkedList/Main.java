package Blind75.LinkedList;

public class Main {
    public static void main(String[] args) {
        ReverseLinkedList solution1 = new ReverseLinkedList();
        MergeTwoSortedLists solution2 = new MergeTwoSortedLists();

        LinkedList linkedList1 = new LinkedList();
        int[] nodePayload1 = {-3, 0, 1, 2, 3, 4, 5};
        ListNode head1 = linkedList1.createLinkedList(nodePayload1);

        System.out.println(solution1.reverseList(head1));
        ListNode current1 = linkedList1.getHead();

        while (current1 != null) {
            System.out.println(current1.val);
            current1 = current1.next;
        }


        LinkedList linkedList2 = new LinkedList();
        int[] nodePayload2a = {3};
        int[] nodePayload2b = {2};
    
        System.out.println("Linked List 1");
        ListNode head2a = linkedList2.createLinkedList(nodePayload2a);
        
        System.out.println("Linked List 2");
        ListNode head2b = linkedList2.createLinkedList(nodePayload2b);

        ListNode head2 = solution2.mergeTwoLists(head2a, head2b);
        
        System.out.println(head2);

        while (head2 != null) {
            System.out.println(head2.val);
            head2 = head2.next;
            if (head2 == null) {
                System.out.println("null");
            }
        }


        
    }
}
