package org.example.oops.practice;

import java.util.Arrays;

public class CustomArrayList_Generics<T>{
    private Object[] arr;
    private static int LENGTH_OF_ARRAY = 10;

    private static int SIZE=0;


    public CustomArrayList_Generics() {
        this.arr = new Object[LENGTH_OF_ARRAY];
    }



    public void add(T a) {
        if(this.arr.length == SIZE){
            resize();
        }
        this.arr[SIZE] = a;
        SIZE++;

    }

    public T get(int index) {
        return (T) this.arr[index];
    }


    public void clear() {
        this.arr = new Object[LENGTH_OF_ARRAY];
    }


    public T remove(int index) {
        arr[index] = 0;
        return (T)arr[index];
    }

    public String toString() {
        return Arrays.toString(this.arr);
    }


    /*public T contains(T number) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == (T)number) {
                return number;
            }
        }
        return ;
    } */


    void resize(){
        Object[] temp = new Object[this.arr.length*2];
        for (int i = 0; i < this.arr.length; i++) {
            temp[i] = this.arr[i];
        }

        this.arr = temp;
    }
}
