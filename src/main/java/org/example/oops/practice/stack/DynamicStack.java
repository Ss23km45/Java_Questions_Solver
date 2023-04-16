package org.example.oops.practice.stack;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }

    public DynamicStack(int Size) {
        super(Size);
    }

    @Override
    public void add(int value) {
        if(super.isFull()){
            int[] temp = new int[stack.length*2];
            for (int i = 0; i <= size; i++) {
                temp[i] = stack[i];
            }

            stack = temp;
        }

        size++;
        stack[size] = value;
    }
}
