package org.example.oops.interview;

import java.util.Arrays;
import java.util.List;

public class InterviewQuetions {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Challa ", "Siva ", "Naga ", "Challa ", "Siva ", "Naga ");
        List<String> list1 = Arrays.asList("Durga ", "", "Durga ", "");
        List<String> list2 = Arrays.asList("Surya ", "Mukesh", "Surya ", "Mukesh");

        //FaltMap will only return the Stream not any other Object

        List<List<String>> finallist = Arrays.asList(list, list1, list2);
        finallist.stream()
                .flatMap(str->str.stream().map(str1->str1.toLowerCase()))
                .distinct()
                .forEach(s -> System.out.print(s));
        System.out.println();
        finallist.stream()
                .flatMap(str->str.stream().map(str1->str1.toUpperCase()))
                .distinct()
                .forEach(s -> System.out.print(s));

        System.out.println();


        int[] arr= new int[]{1,4,3,2,4,9,4,3,2,4,9,8,4,3,2,4,9,8,6,24,5,24,6,456342,255243,4356};
        char[] arr1= new char[]{'a','f','t','h','b'};
        Arrays.stream(arr).distinct().forEach(ch -> System.out.print(" " + ch + " "));

        System.out.println();
        Base son2 = new Base(22,"Mukesh Ch", 99.99f);
        Base son1 = new Base(26,"Kedhar Ch", 99.98f);
        Base base1 = new Base(55,"Satyanarayana Ch", 100.00f);
        Base base2 = new Base(45,"Satyavathi Ch", 100.00f);
        Base son21 = new Base(22,"Mukesh Ch", 99.99f);
        Base son11 = new Base(26,"Kedhar Ch", 99.98f);
        Base base11 = new Base(55,"Satyanarayana Ch", 100.00f);
        Base base21 = new Base(45,"Satyavathi Ch", 100.00f);

        List<Base> myList = Arrays.asList(son1,son2,son21,son11);
        List<Base> myPList = Arrays.asList(base2,base2,base11,base21);

        List<List<Base>> faList = Arrays.asList(myList, myPList);

        faList.stream()
                .flatMap(lst -> lst.stream())
                .filter(fl -> fl.getAge()>20)
                .distinct()
                .forEach(fl -> System.out.print(fl.getName() + " ##### "));




    }
}
