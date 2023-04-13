package org.example.oops.practice.lambda;

public class LambdaExpressions{
    public static void main(String[] args) {

        Operations add = (i, j) -> {return i+j;};
        Operations div = (i, j) -> {return i/j;};
        Operations mul = (i, j) -> {return i*j;};

        System.out.println(calculator(34,35, add));
        System.out.println(calculator(34,3546, div));
        System.out.println(calculator(34,42566, mul));
    }

    private static int calculator(int a, int b, Operations OP) {
        return OP.operation(a,b);
    }

    public interface Operations {
        int operation(int a, int b);
    }
}
