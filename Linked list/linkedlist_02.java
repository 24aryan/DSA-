import java.util.LinkedList;

public class linkedlist_02{
    public static class Node {
        int data;
        Node next;

        // Constructor to create a single node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        // Static head and tail as there exists one linked list
        public static Node head;
        public static Node tail;
        
        // Method to add a node at the beginning
        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // Method to insert a node at the end
        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
    }
}
