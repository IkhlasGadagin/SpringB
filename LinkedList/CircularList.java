package LinkedList;

public class CircularList {

    private Node head;
    private Node tail;

    public CircularList() {
        this.head = head;
        this.tail = tail;
    }
    public void insertLast(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
            return;
        }

            tail.next=node;
            node.next=head;
            tail=node;
            return;

    }
    public void delete(int val){
        Node trav=head;
        if(trav==null){
            return;
        }
        if(trav.value==val){
            head=head.next;
            tail.next=head;
            return;
        }
        do {
            Node n=trav.next;
            if(n.value==val){
                trav.next=n.next;
                break;
            }
            trav=trav.next;
        }while(trav!=head);
    }
    public void display() {
        Node node = head;
        if (head != null) ;
        {
            do {
                System.out.print(node.value + "->");
                node = node.next;
            }
            while (node != head);
        }
        System.out.println();
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value =value;
            this.next = next;
        }
    }
}
