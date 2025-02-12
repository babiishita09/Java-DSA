package LinkedList;

/*
    Remove Nth Node From End of List-------------------------------
 */
public class removeNthNodeFromEnd {


    static Node removeNthFromEnd(Node head, int n) {

//        Initialized two pointers, fast and slow
        Node fastPointer = head;
        Node slowPointer = head;

//        Move fastPointer n step ahead
        for (int i = 0; i < n; i++) {
            if (fastPointer == null) {
                return head;
            }
            fastPointer = fastPointer.next;
        }

//        If fastPointer is null remove the head node
        if (fastPointer == null) {
            return head.next;
        }

//        Move both pointers until fastPointer reaches the end
        while (fastPointer.next != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }

//        remove the nth node from end
        slowPointer.next = slowPointer.next.next;
        return head;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }


    public static void main(String args[]) {

        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(9);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(1);

        int n = 5;

        Node newHead = removeNthFromEnd(head, n);
        System.out.println("New List : ");
        printList(newHead);
    }
}
