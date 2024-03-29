package org.example.oops.practice.SingleLinkedList;

public class SingleLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public void insertAtTheStart(int value){
        Node node = new Node(value);
        node.next = head;  //Here Head is Defaulty null so foe the first Object we are assiging to null
        head = node; //Here Head value will become node

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertAtEnd(int eValue){
       if(tail == null){
           insertAtTheStart(eValue);
           return;
       }
       Node node = new Node(eValue);
       tail.next = node;
       tail = node;
       size++;

    }

    public int deleteHeadNode(){
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;

        return value;
    }

    public int deleteLastNode(){
        if(size<=1){
            deleteHeadNode();
        }

        Node temp = head;
        for (int i = 1; i < size-1; i++) {
            temp = temp.next;
        }

        int value = temp.next.value;

        tail= temp;
        temp.next = null;
        size--;

        return value;
    }


    public void insert(int value, int index){
        if(index==0){
            insertAtTheStart(value);
            return;
        }
        if(index==size){
            insertAtEnd(value);
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;

    }

    public int delete(int index){
        if(size <=1){
            deleteHeadNode();
        }

        if(size ==index){
            deleteLastNode();
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        int value = temp.next.value;

        temp.next = temp.next.next;
        size--;
        return value;
    }


    public void display(){
        //Always Use temp to display Values
        Node temp = head;
        System.out.print("Start ==>");
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value + " ==> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    //Recusrion using LinkedList

    public void inserRec(int index, int Value){
        Node node = new Node(Value);
        Node temp = null;
        if(index ==0){
            node.next = head;
            head = node;
            return;
        }
        temp = head;

        //Node temp = head;

        inserRec(index, Value, temp);
    }

    private void inserRec(int index, int value, Node temp) {
        if(index == 0){
            Node node = new Node(value);
            node.next = temp.next.next;
            temp.next = node;
        }
        else if(temp == null){
            System.out.println("Cannot Insert at the index which you gave ");
            return;
        }
        else{
            inserRec(index-1, value, temp.next);
        }
    }

    private class Node{
       private int value;
       private Node next;

       Node(int Value){
           this.value = Value;
       }

       Node(int Value, Node node){
           this.value = Value;
           this.next = node;  // This Actually Means New Node(Value) ===>  Node(int Value) { this.value = Value; }
       }

    }
}
