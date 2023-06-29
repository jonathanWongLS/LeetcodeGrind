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
        LinkedListCycle solution5 = new LinkedListCycle();
        MergeKSortedLists solution6 = new MergeKSortedLists();

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


        LinkedList linkedList5 = new LinkedList();
        int[] nodePayload5 = {1,2};
        ListNode head5 = linkedList5.createLinkedListWithCycle(nodePayload5, 0);

        System.out.println(solution5.hasCycle(head5));


        LinkedList linkedList5a = new LinkedList();
        int[] nodePayload5a = {1,4,5};
        ListNode head5a = linkedList5a.createLinkedList(nodePayload5a);

        LinkedList linkedList5b = new LinkedList();
        int[] nodePayload5b = {1,3,4};
        ListNode head5b = linkedList5b.createLinkedList(nodePayload5b);

        LinkedList linkedList5c = new LinkedList();
        int[] nodePayload5c = {2,6};
        ListNode head5c = linkedList5c.createLinkedList(nodePayload5c);

        LinkedList linkedList5d = new LinkedList();
        int[] nodePayload5d = new int[1];
        ListNode head5d = linkedList5d.createLinkedList(nodePayload5d);

        // ListNode[] linkedLists5 = new ListNode[3];
        // linkedLists5[0] = head5a;
        // linkedLists5[1] = head5b;
        // linkedLists5[2] = head5c;
        
        ListNode[] linkedLists5 = new ListNode[1];
        linkedLists5[0] = head5d;

        printLinkedList(solution6.mergeKLists(linkedLists5));

    }
}
