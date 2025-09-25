package LinkedList.ListCycle2;
import LinkedList.ListNode;

public class LinkedListCycle2 {


    // first we check if cycle exists
    // take 2 pointer slow and fast and mpve fast 2 time
    //if they meet cycle exists.

    public ListNode detectCycle(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        if(fast==null||fast.next==null){
            return null;
        }

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                ListNode pos = slow;
                ListNode cur = head;
                while(cur != pos){
                    cur = cur.next;
                    pos = pos.next;
                }
                return pos;
            }

        }
        return null;
    }


}
