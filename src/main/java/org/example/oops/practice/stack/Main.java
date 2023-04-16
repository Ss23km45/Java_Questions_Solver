package org.example.oops.practice.stack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack();
        stack.add(12);
        stack.add(24);
        stack.add(56);
        stack.add(172);
        stack.add(8);
        stack.add(87);
        stack.add(46);
        stack.add(465);
        stack.add(367);
        stack.add(68);
        stack.add(876);
        stack.add(56);
        System.out.println(stack.isFull());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

        Set set= new HashSet();
        HashMap map = new HashMap();

    }
}
