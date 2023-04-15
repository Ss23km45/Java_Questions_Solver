package org.example.oops.practice.set;

import java.util.Arrays;
import java.util.HashSet;

public class Set {

    public static void main(String[] args) {
        java.util.Set set = new HashSet();
        set.add(2);
        set.add(43);
        set.add(2);set.add(43);
        int[] arr = new int[5];
        arr[0] = 10;
        arr[4] = 13;
        arr[3] = 10;
        arr[2] = 11;
        arr[1] = 23;

        System.out.println(Arrays.toString(arr));

        java.util.Set set1 = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            set1.add(arr[i]);

        }

        System.out.println(set1.stream().sorted().toString());

        String str = "Challa Siva Naga Durga Surya Mukesh";
        String str2 = str.toLowerCase();
        java.util.Set setch = new HashSet();
        char[] chars;
        chars = str2.toCharArray();
        System.out.println(Arrays.toString(chars));
        for (int i = 0; i < chars.length; i++) {
            setch.add(chars[i]);
        }
        System.out.println(Arrays.toString(setch.stream().sorted().toArray()));

        System.out.println(setch.stream().count());


    }
}
