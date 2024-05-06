public class linkedlist_01 {
    // creating a class of nodes in which every node acts as an individual object with the help of a constructor
    public static class Node {
        int data;
        Node next;

        // constructor to create a single node
        public Node(int data) {
            // "this" keyword referring to the object
            this.data = data;
            this.next = null;
        }
    }

    // this is also a function but private
    // here the constructor is working too

    // generally we use int and data type for defining variables and declaring function
    //but instead here we use Node it does the same as other data types

    //here we have a function which converts the array elements into linked list
    private static Node array2link(int[] arr) {
        //creating a head which will point the first element
        Node head = new Node(arr[0]);
        // creating a variable mover to point head
        //so that we can connect next of other elements with the head
        Node mover = head;
        // traversing the array and creating them as nodes
        for (int i = 1; i < arr.length; i++) {
            // creating  a node name temp for each element of the array
            Node temp = new Node(arr[i]);
            // pointing the next of the node to the temp element
            mover.next = temp;
            // now moving the mover to the temp to repeat and connect other temp
            mover = temp;
        }
        // returning the head as unlike the array we can't return the whole array so only is returned here
        return head;
    }


    // to find length of a linked list
    private static int lengthlist(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
           temp=temp.next;
            count++;
        }
        return count;
    }

    // search an element in linked list
    private static int checklist(Node head , int val){
        Node temp = head;
        while(temp!=null){
            if(temp.data == val) return 1;
            temp = temp.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 6};
        // by constructor creating node
        //   Node y = new Node(arr[2]);
        // displaying data in node
        //  System.out.println(y.data);

        Node head = array2link(arr);
        //    System.out.println(head.data);

        // traversing a linkedlist
//         creating a temp variable at head
        Node temp = head;
        // traversing it till the next is not null
        while (temp != null) {
            // printing the data
            System.out.println(temp.data + " ");
            // moving to the next element as temp;
            temp = temp.next;

            System.out.println(lengthlist(head));

            System.out.println(checklist(head, 4));
        }
    }
    }


