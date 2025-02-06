package LinkedList;

public class mergedTwoLinkedList {

    static Node sortedMerged(Node list1, Node list2){

        /* create a dummy node */
        Node dummyNode = new Node(-1);
        Node curr = dummyNode;


        while(list1 != null && list2 != null){

            if(list1.data <= list2.data){
                curr.next = list1;
                list1= list1.next;
            }
            else{
                curr.next = list2;
                list2= list2.next;
            }

            curr = curr.next;
        }

        /* If any list is left, append it to the merged list*/

        if(list1 != null ){
            curr.next= list1;
        }
        else{
            curr.next = list2;
        }

        return dummyNode.next;
    }

    /* printing list */
    static void printList(Node head){
        while(head != null){
            System.out.print(head.data+ " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String args[]){

        /* first list---------------------- */
        Node list1 = new Node(2);
        list1.next = new Node(4);
        list1.next.next = new Node(5);


        /*  second list--------------------- */
        Node list2 = new Node(0);
        list2.next = new Node(3);
        list2.next.next = new Node(7);

        Node newHead= sortedMerged(list1, list2);
        System.out.println("merged list---------------------------");
        printList(newHead);
    }
}
