package LinkedList;

import com.ikhlas.DoubleList;

public class DLLMain {
    public static void main(String[] args) {


        DLL d = new DLL();
        d.insertFirst(10);
        d.insertFirst(20);
        d.insertFirst(30);
        d.insertFirst(40);
        d.insertFirst(50);
        d.insertFirst(60);
        d.insertLast(41);


        d.display();
        d.insertAfter(20,21);
        d.insertAfter(60,61);
        d.display();
    }
}