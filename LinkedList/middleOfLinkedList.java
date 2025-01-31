package LinkedList;

public class middleOfLinkedList {

//    naive approach------------------------------
    static int getLength(Node head){
        int length=0;
        while(head != null){
            length++;
            head = head.next;
        }

        return length;
    }

    static int midOfLinkedList(Node head){
        int mid_index = getLength(head)/2;

        while(mid_index>0){
            head = head.next;
            mid_index--;
        }

        return head.data;

    }

//    fast and slow pointer approach------------------------

    static int middleOfLL(Node head){
        Node fast_pointer= head, slow_pointer= head;

        while(fast_pointer != null && fast_pointer.next != null){
            fast_pointer = fast_pointer.next.next;
            slow_pointer = slow_pointer.next;
        }

        return slow_pointer.data;
    }

    public static void main(String args[]){
        Node head = new Node(1);
        head.next= new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("length of this linked list : "+ getLength(head));

        System.out.println("middle of linked list is : "+ midOfLinkedList(head));

        System.out.println("middle of a linked list using fast and slow pointer is : "+ middleOfLL(head));
    }
}
