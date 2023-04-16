package org.example.oops.maps;

import java.util.*;
import java.util.stream.Stream;

public class Mapping {
    public static void main(String[] args) {

        //1.Iterate through a HashMap KeySet;
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"C");
        map.put(2,"Java");
        map.put(3,"JSP-Servlets");
        map.put(4,"Spring-Boot");
        Iterator<Integer> itera = map.keySet().iterator();
        while(itera.hasNext()){
            Integer itr = itera.next();
            System.out.println("**** Values :--- " + map.get(itr) );
        }

        //2.Iterate thourgh forEach loop
        for (Map.Entry<Integer, String> iterate1 : map.entrySet()) {
            System.out.println(iterate1.getKey() + " <++> "  + iterate1.getValue());
        }

        //3.Iterate Thourgh Lambda Expressions
        map.forEach(Mapping::accept);

        //4. Using Stream API
        map.entrySet().stream().forEach((entry) -> {
            System.out.println(entry.getValue());
        });

        // Get the stream
        Stream<String> stream
                = Stream.of("Geeks", "For",
                "Geeks", "A",
                "Computer",
                "Portal");

        // Print the stream
        // using double colon operator
        ArrayList<Integer> li = new ArrayList<>();
        li.add(12);
        li.add(13);
        li.forEach(System.out::println);
        

    }

    private static void accept(Integer key, String Value) {
        System.out.println(key + "  ---  " + Value);
    }
}
