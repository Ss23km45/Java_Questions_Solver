package org.example.oops.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountPairs {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int L = scanner.nextInt();

        for (int i = 0; i < L; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println(list);

    }

    static int magicNumber(List<Integer> list, int K)
    {   int number=0;

        return number;
    }
}
