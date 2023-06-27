package Blind75.LinkedList;

public class Main {

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
            if (head == null) {
                System.out.println("null");
            }
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList solution1 = new ReverseLinkedList();
        MergeTwoSortedLists solution2 = new MergeTwoSortedLists();
        ReorderList solution3 = new ReorderList();
        RemoveNthNodeFromEndofList solution4 = new RemoveNthNodeFromEndofList();

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

        printLinkedList(head2);


        LinkedList linkedList3 = new LinkedList();
        int[] nodePayload3 = {1,2,3,4};
        ListNode head3 = linkedList3.createLinkedList(nodePayload3);

        solution3.reorderList(head3);

        System.out.println(head3);

        printLinkedList(head3);


        LinkedList linkedList4 = new LinkedList();
        int[] nodePayload4 = {1,2,3,4,5};
        ListNode head4 = linkedList4.createLinkedList(nodePayload4);

        head4 = solution4.removeNthFromEnd(head4, 2);
        System.out.println(head4);
        printLinkedList(head4);

    }
}
