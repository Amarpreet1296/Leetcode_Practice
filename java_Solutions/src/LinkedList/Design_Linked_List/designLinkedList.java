package LinkedList.Design_Linked_List;

public class designLinkedList {


    // define the node structure
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    private Node head;
    private int size;

    //intialize the list
    public designLinkedList() {

        head = null;
        size = 0;

    }

    public int get(int index) {
        // first check the bounds
        if (index < 0 || index >= size) {
            return -1;
        }

        Node curr = head;
        for (int i = 0; i < index; i++) { // loop to the req index
            curr = curr.next;
        }
        return curr.data;

    }

    public void addAtHead(int val) {
        // create a new node first of val
        Node curr = new Node(val);
        curr.next = head;
        head = curr;
        size++;

    }

    public void addAtTail(int val) {

        //check if the list exists
        if (head == null) {
            addAtHead(val);
            return;
        }
        Node curr = head;

        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(val);
        size++;
    }

    public void addAtIndex(int index, int val) {

        //check of within bounds
        if(index < 0 || index > size) {
            return;
        }
         //check if index at start
        if(index == 0) {
            addAtHead(val);
            return;
        }

        //if index at tail
        if(index == size) {
            addAtTail(val);
            return;
        }

        // if in the middle
        Node curr = head;
        Node newNode = new Node(val);
        for (int i = 0; i < index-1; i++) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;

        size++;

    }

    public void deleteAtIndex(int index) {

        //check if valid list
        if(index < 0 || index >= size) {
            return;
        }

        //  delete at head
        if(index == 0) {
            head = head.next;
        } else {
            Node curr = head;
            for(int i = 0; i < index-1; i++) { // traverse 1 nnode behind we want to del
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        size--;
    }
}
