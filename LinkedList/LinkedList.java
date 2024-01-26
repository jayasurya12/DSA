public class LinkedList {
    class Node {
        int data;
        Node next;

        Node(val) {
            data = val;
            next = null;
        }
    }

    LinkedList() {
        head = null;
    }

    public void insertAtBeginng(int val) {
        Node newNode = new Node(val);
        // when list empty
        if (head == null) {
            head = newNode;
        } else { //list is not empty
            newNode.next = head;
            head = newNode;
        }
    }
    public void display( ) {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next; // Jump...
        }
    }
    public void insertAtPos(int pos, int val) {
        if (pos == 0) {
            insertAtBeginng(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;

        for(int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
}