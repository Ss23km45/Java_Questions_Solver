package org.example.oops.practice.DLinkedList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MAin {
    public static void main(String[] args) {
        DoublyLinkedList DLL = new DoublyLinkedList();
        DLL.insertAtTheStart(12);
        DLL.insertAtTheStart(23);
        DLL.insertAtTheStart(53);
        DLL.insertAtTheStart(24);
        DLL.insertAtTheStart(546);
        DLL.insertAtTheStart(6765);
        DLL.insertAtTheStart(5678);

        DLL.display();

        LinkedList lnked = new LinkedList();
        lnked.add(231);
        lnked.add(535);
        lnked.add(446);
        lnked.add(5467765);
        System.out.println();
        Object[] arr = lnked.toArray();
        Arrays.sort(arr);
        System.out.println(lnked);

        DoublyLinkedList D2 = new DoublyLinkedList();
        D2.insertLast(12);
        D2.insertLast(23);
        D2.insertLast(53);
        D2.insertLast(24);
        D2.insertLast(546);
        D2.insertLast(6765);
        D2.insertLast(5678);

        D2.display();

    }


}
