package org.example.oops.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsInJava {
    public static void main(String[] args) {
////        //Streams will be used in Collection properties to filter the data for any type
////        List<Integer> arrayList =  Arrays.asList(1,23,34,45,3,12,32,45,345,65,68); //new ArrayList<>();
////        //I want only even numbers
////        arrayList.stream().filter(a -> a%2 == 0).forEach(System.out::println);
////        //Another way
//          List<Integer> collect = new ArrayList<>();
////        collect = arrayList.stream().filter(a -> a%2 == 0).collect(Collectors.toList());
////        System.out.println(collect);
//          List<Integer> arrayList =  Arrays.asList(1,23,34,45,3,12,32,45,345,65,68);
////        collect = arrayList.stream().distinct().collect(Collectors.toList());
//          Predicate<Integer> pre = e -> (e+1)%2 == 0;
//          //To USe AllMatch, AnyMatch, NoneMatch we have to pass a predicate Value to it so that all values will
//          // passed to it and check respective conditions if matching or not
//          System.out.println(arrayList.stream().allMatch(pre));
//          System.out.println(arrayList.stream().anyMatch(pre));
//          System.out.println(arrayList.stream().noneMatch(pre));
//    //    System.out.println(collect);
//          List<Character> charList =  Arrays.asList('a','v','a','h','a','w','a','l','a');
//          charList.stream().filter(a -> !a.equals('h')).forEach(System.out::println);
//          charList.stream().distinct().forEach(System.out::print);

          Book book1 = new Book(12,"BhagavathGita", 876543);
          Book book2 = new Book(44,"Ramayanam", 23435);
          Book book3 = new Book(53,"Mahabharatham", 442424);
          Book book4 = new Book(38,"LordGanesh", 67765);

          List<Book> booklist = Arrays.asList(book1,book2,book3,book4);
          List<Book> newList;
          newList = booklist.stream().filter(book -> book.getCount() < 50).collect(Collectors.toList());

          for (Book list: newList) {
                System.out.println(list.getName().toString());
          }

          booklist.stream().filter(book -> book.getCount() < 50).forEach(book -> System.out.println(book.getName()));
    }

//

}
