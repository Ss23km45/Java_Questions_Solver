package org.example.oops.practice.CLL;

public class CircularLinkedList {
    private Node head;
    private Node tail;

    public void insert(int val){
        Node node = new Node(val);
        if(head==null){
            tail = node;
            head= node;
        }

        tail.next = node;
        tail = node;
        tail.next = head;

    }

    public void delete(int val)
    {
        Node node = head;
        if(node.value == val){
            head = head.next;
            tail = tail.next;
        }
        do {
            Node n = node.next;
            if (n.value == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }

    public void display(){
        Node node =head;
        while(tail != node){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.print(node.value + "--> HEAD");
    }


    class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
