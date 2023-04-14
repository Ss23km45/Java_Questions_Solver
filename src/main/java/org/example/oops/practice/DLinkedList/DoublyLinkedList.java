package org.example.oops.practice.DLinkedList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public void insertAtTheStart(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }

        head = node;
        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public void display(){
        Node temp = head;
        System.out.print("START --> ");
        while(temp !=null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.print("END");
    }






    private class Node{
        private int value;

        public Node(int value) {
            this.value = value;
        }

        private Node next;
        private Node prev;

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }



    }
}
