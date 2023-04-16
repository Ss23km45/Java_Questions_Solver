package org.example.oops.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalMethods {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,42,43,65,76,55,32,65);
        //Implementing Min and Max Values
        Optional<Integer>val = list.stream()
                .distinct()
                .min((a,b) -> a.compareTo(b));
        System.out.println(val.get());

        Optional<Integer>val2 = list.stream()
                .distinct()
                .max((a,b) -> a.compareTo(b));
        System.out.println(val2.get());
//       MAx and Min Functions ill only for for Integer types
//        List<String> strList = Arrays.asList("abc", "CBDH", "DHADH", "dKHCIUF","hfh");
//        Optional<String> star = strList.stream()
//                .distinct()
//                .min((a,b) -> a.compareTo(b));
//        System.out.println(star.get());
//
//        Optional<String> star1 = strList.stream()
//                .distinct()
//                .max((a,b) -> {
//                    return a.length() > b.length();
//                });
//        System.out.println(star1.get());
        List<String> strList = Arrays.asList("abc", "CBDH", "DHADH", "dKHCIUF","hfh");
  //      Object[] star2 =
        List<String> strList2;
        strList.stream().map(str->str.toLowerCase()).forEach(System.out::println);
        //System.out.println(Arrays.toString(star2) + " with Length of "  + star2.length);
        strList2 = strList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(strList2);
    }
}
