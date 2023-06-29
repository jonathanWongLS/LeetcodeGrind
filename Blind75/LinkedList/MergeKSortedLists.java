package Blind75.LinkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1.val < o2.val) 
                    return -1;
                else if (o1.val == o2.val) 
                    return 0;
                else 
                    return 1;
            }
        });   

        for (ListNode node: lists) {
            if (node != null) {
                priorityQueue.add(node);
            }
        }

        ListNode head = new ListNode(0);
        ListNode currentNode = head;

        while (!priorityQueue.isEmpty()) {
            currentNode.next = priorityQueue.poll();
            currentNode = currentNode.next;
            if (currentNode.next != null) {
                priorityQueue.add(currentNode.next);
            }
        }
    
        return head.next;

    }
}
