package org.example.oops.practice.comparision;

import java.util.Arrays;
import java.util.Comparator;

public class Main { 
    public static void main(String[] args) {
        Student mukesh = new Student(23,88.432f);
        Student kedar = new Student(22, 89.64f);
        Student amma = new Student(23,90.432f);
        Student nanna = new Student(22, 95.64f);
        Student random = new Student(23,65.432f);
        Student random1 = new Student(22, 76.64f);

        Student[] students = new Student[]{
                mukesh,kedar, amma, nanna, random1, random
        };
        System.out.println(Arrays.toString(students));


        //Using Comparator here in main method
        /*Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.compareTo(o2);
            }
        }); */

        System.out.println(Arrays.toString(students));

        /*if(mukesh.compareTo(kedar) > 0){
            System.out.println("Mukesh Object is Bigger");
        }else {
            System.out.println("Kedar Object is Bigger");
        } */

        //We Achive the Same by using Lamba expressions

        Arrays.sort(students, (a, b) -> (int)(a.Marks - b.Marks));
        System.out.println(Arrays.toString(students));

    }
}
