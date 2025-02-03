package LinkedList;

public class rotateOfLinkedList {

    static Node rotateOfLL(Node head, int k){
/*    edge cases----------- */

        if(head == null || head.next == null || k==0)
            return head;


/*       compute the length---------------   */
        Node curr = head;
        int length =1;

        while(curr.next != null){
            curr = curr.next;
            length ++;
        }

/*     go to that node-------------------     */
        curr.next = head;
        k= length - k% length;

        while(k-- >0) curr = curr.next;

        head = curr.next;
        curr.next = null;

        return head;

    }

    /* printing of list---------------------------   */
    static void printList(Node head){
        Node curr =head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);

        Node newHead = rotateOfLL(head, 18);
        printList(newHead);
    }
}
