package org.example.oops.practice;

import java.util.Arrays;

public class CustomArrayList implements ArrayListTemplate{
    int[] arr;
    private static int LENGTH_OF_ARRAY = 10;

    private static int SIZE=0;


    public CustomArrayList() {
        this.arr = new int[LENGTH_OF_ARRAY];
    }


    @Override
    public void add(int a) {
        if(this.arr.length == SIZE){
            resize();
        }
        this.arr[SIZE] = a;
        SIZE++;

    }

    @Override
    public int get(int index) {
        return this.arr[index];
    }

    @Override
    public void clear() {
        this.arr = new int[LENGTH_OF_ARRAY];
    }

    @Override
    public int remove(int index) {
        arr[index] = 0;
        return arr[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(this.arr);
    }

    @Override
    public int contains(int number) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number) {
                return i;
            }
        }
        return -1;
    }


    void resize(){
        int[] temp = new int[this.arr.length*2];
        for (int i = 0; i < this.arr.length; i++) {
            temp[i] = this.arr[i];
        }

        this.arr = temp;
    }
}
