package LinkedList.ListCycle;


import LinkedList.ListNode;

public class CycledLinkedList {
    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null ) { return false; }

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;
    }


    public static void main(String[] args) {
        CycledLinkedList checker = new CycledLinkedList();

        // Example 1: Linked list with NO cycle: 1 -> 2 -> 3 -> null
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);

        System.out.println("List 1 has cycle? " + checker.hasCycle(head1)); // false

        // Example 2: Linked list WITH cycle: 1 -> 2 -> 3 -> 4 -> back to 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = head2.next; // creates cycle (4 -> 2)

        System.out.println("List 2 has cycle? " + checker.hasCycle(head2)); // true
    }

}
