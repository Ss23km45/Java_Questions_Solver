package org.example.oops.practice;

public class Nested {

    public interface NesitedInterface
    {
        int add(int a, int b);
    }
}
class B implements Nested.NesitedInterface{


    @Override
    public int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        B b = new B();

        System.out.println(b.add(10,20));
    }
}
