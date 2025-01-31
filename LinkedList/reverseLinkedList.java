package LinkedList;

class reverseLinkedList {

    static Node reverseList(Node head){

        Node curr= head, prev= null, next;

        while(curr != null){
            next = curr.next;
            curr.next= prev;

            prev=curr;
            curr=next;
        }
        return prev;
    }

    static void printList(Node node){
        while(node != null){
            System.out.print(" "+ node.data);
            node= node.next;
        }
    }

    public static void main(String args[]){

        Node head= new Node(1);
        head.next = new Node(2);
        head.next.next= new Node(3);

        System.out.println("input list");
        printList(head);

        head = reverseList(head);
        System.out.println("\nReverse List");
        printList(head);
    }

}
