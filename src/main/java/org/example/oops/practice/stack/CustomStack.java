package org.example.oops.practice.stack;

public class CustomStack {

    protected int[] stack;

    private static final int DEFAULT_SIZE = 10;

    int size = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int Size){
        this.stack = new int[Size];
    }

    public void add(int value){
        if(isFull()){
            System.out.println("Stack is Full Not able to add any other Values");
            return;
        }

        size++;
        stack[size] = value;
    }

    public int pop(){
        int num = stack[size];
        size--;
        return num;
    }

    public boolean isFull() {
        return size == DEFAULT_SIZE-1;
    }

    public boolean isEmpty() {
        return size == -1;
    }
}
