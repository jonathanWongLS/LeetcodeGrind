package Blind75.LinkedList;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if (list1 == null && list2 == null) {
            return null;
        }
        else if (list1 == null && list2 != null) {
            return list2;
        }
        else if (list1 != null && list2 == null) {
            return list1;
        }

        ListNode resHead = new ListNode(0);
        ListNode currentNode = resHead;

        while (true) {
            if (list1 == null) {
                currentNode.next = list2;
                break;
            }
            
            if (list2 == null) {
                currentNode.next = list1;
                break;
            }
            
            if (list1.val <= list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            }
            else {
                currentNode.next = list2;
                list2 = list2.next;
            }

            currentNode = currentNode.next;
        }

        return resHead.next;
    }
}
