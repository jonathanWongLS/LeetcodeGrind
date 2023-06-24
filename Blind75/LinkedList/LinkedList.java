package Blind75.LinkedList;

public class LinkedList {

    private ListNode head;

    public LinkedList() {}

    public ListNode getHead() {
        return head;
    }

    public ListNode createLinkedList(int[] nodePayload) {        
        
        ListNode currentNode = null;
        
        for (int i = 0; i < nodePayload.length; i++) {
         
            if (i == 0) {
                currentNode = new ListNode(nodePayload[i]); 
                this.head = currentNode;
                currentNode.next = new ListNode(nodePayload[++i]);
            }
            else {
                if (i != nodePayload.length-1) { 
                    currentNode.next = new ListNode(nodePayload[i]);
                }
                else {
                    currentNode.next = null;
                }
            }

            currentNode = currentNode.next;
        }

        return this.head;
    }
}
