package org.example.oops.practice.CLL;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(12);
        cll.insert(32);
        cll.insert(245);
        cll.insert(45);
        cll.insert(356);
        cll.insert(53);

        cll.insert(245);
        cll.insert(4625);
        cll.insert(245678);
        cll.insert(76);
        cll.insert(365756);
        cll.insert(567);

        cll.display();

        System.out.println();
        cll.delete(245678);
        cll.display();


    }
}
