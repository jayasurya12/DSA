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
}