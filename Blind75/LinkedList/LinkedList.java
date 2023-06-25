package Blind75.LinkedList;

public class LinkedList {

    private ListNode head = null;

    public LinkedList() {}

    public ListNode getHead() {
        return head;
    }

    public ListNode createLinkedList(int[] nodePayload) {        
        
        ListNode currentNode = null;
        int i = 0;

        if (nodePayload.length == 0) {
            System.out.println("Node 0: null\n");
            return this.head;
        }

        if (nodePayload.length == 1) {
            this.head = new ListNode(nodePayload[0]);
            System.out.println("Node 0: " + nodePayload[0]);
            System.out.println("Node 1: null\n");
            return this.head;
        }
        
        for (i = 0; i < nodePayload.length; i++) {
            if (i == 0) {
                currentNode = new ListNode(nodePayload[i]);
                this.head = currentNode;
                System.out.println("Node " + Integer.toString(i) + ": " + nodePayload[i]);
                currentNode.next = new ListNode(nodePayload[++i]);
                System.out.println("Node " + Integer.toString(i) + ": " + nodePayload[i]);
            }     
            else {
                System.out.println("Node " + Integer.toString(i) + ": " + nodePayload[i]);
                currentNode.next = new ListNode(nodePayload[i]);
            }
    
            currentNode = currentNode.next;
        }

        System.out.println("Node " + Integer.toString(i) + ": null\n");

        return this.head;
    }
}
