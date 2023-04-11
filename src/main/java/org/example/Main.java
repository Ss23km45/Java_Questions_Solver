package org.example;

import org.example.oops.practice.CustomArrayList;
import org.example.oops.practice.CustomArrayList_Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        CustomArrayList arrayList = new CustomArrayList();
        arrayList.add(124);
        arrayList.add(242);
        arrayList.add(45);
        arrayList.add(62);
        arrayList.add(24);
        arrayList.add(63);
        arrayList.add(42);
        arrayList.add(256);
        System.out.println(arrayList.get(5));
        System.out.println(arrayList.contains(256));
        System.out.println(arrayList.remove(4));
        arrayList.clear();
        System.out.println((arrayList));

        CustomArrayList_Generics<Character> gene = new CustomArrayList_Generics<Character>();
        gene.add('a');
        gene.add('a');
        gene.add('a');
        gene.add('a');
        gene.add('a');
        gene.add('a');

        System.out.println(gene.get(5));
        //System.out.println(gene.contains(256));
        System.out.println(gene.remove(4));
        System.out.println(gene);




    }
}