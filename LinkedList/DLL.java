package LinkedList;

import com.ikhlas.LL;

public class DLL {

    private Node head;
    private int size=0;


    public void insertFirst(int value) {

        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int value){
        Node node=new Node(value);
        Node last=head;
        node.next=null;

        if(head==null){
            node.prev=null;
            head=node;
            return;
        }

        while (last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
    }
    public void insertAt(int value,int index){
        if(index==0){
            insertFirst(value);
        }
        if(index==size){
            insertLast(value);
        }
        Node temp=head;
        for (int i = 1; i <index ; i++) {
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        node.prev=temp;
        size++;
    }

    public Node getref(int val){
        Node nod=head;
        while(nod!=null){
            if(nod.value==val){
                return nod;
            }
            nod=nod.next;
        }
        return null;
    }
    public void insertAfter(int after,int val){
        Node p=getref(after);
        if(p==null){
            System.out.println("does not exist");
            return;
        }
        Node node=new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev=node;
        }
    }
   public void display(){

        Node trev=head;
        Node last=head;
        while (trev!=null){
            System.out.print(trev.value+"-");
            last=trev;
            trev=trev.next;
        }
       System.out.println();

   }

    class Node {

        int value;

        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
