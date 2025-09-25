package LinkedList.IntersectionList;
import LinkedList.ListNode;



public class ListIntersection {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

            if(headA == null || headB == null) return null;

            ListNode pA = headA;
            ListNode pB = headB;

            if(pA == null && pB == null) {
                return null;
            }

            while(pA != pB){
                pA = (pA == null) ? headB : pA.next;
                pB = (pB == null) ? headA : pB.next;
            }

            return pA;
        }
    }
}
