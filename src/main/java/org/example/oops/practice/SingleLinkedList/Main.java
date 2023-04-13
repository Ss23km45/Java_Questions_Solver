package org.example.oops.practice.SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList single = new SingleLinkedList();
        single.insertAtTheStart(23);
        single.insertAtTheStart(33);
        single.insertAtTheStart(43);

        SingleLinkedList single2 = new SingleLinkedList();
        single2.insertAtEnd(53);
        single2.insertAtEnd(63);
        single2.insertAtEnd(73);
        single2.insertAtEnd(83);
        single2.insertAtEnd(334);
        single2.insertAtEnd(2424);
        single2.insertAtEnd(25436);

        //single2.display();
        single2.deleteHeadNode();
        //single2.display();

        single2.insert(84,0);
        //single2.display();
        single2.insert(34,2);
        //System.out.println();
        //single2.display();
        single2.display();
        //single2.deleteLastNode();
        single2.delete(4);
        System.out.println();
        single2.display();


    }
}
