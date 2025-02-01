package LinkedList;

public class cycleOfLinkedList {


    static boolean cycleOfLL(Node head){
        Node fast_pt= head, slow_pt= head;

        while(fast_pt != null && fast_pt.next != null){
            fast_pt = fast_pt.next.next;
            slow_pt = slow_pt.next;

            if(fast_pt == slow_pt)
                return true;
        }
        return false;
    }


    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);

//        create a loop-----
        head.next.next.next = head.next;

        System.out.println(cycleOfLL(head));
    }
}
