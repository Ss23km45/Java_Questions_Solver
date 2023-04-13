package org.example.oops.practice;

public class exceptions {
    public static void main(String[] args) {
        //There are Two type of exceptions
        //Run time and Compile Time
        int a =19;
        int b = 0;
        try {
            int c = divide(a,b);
        }catch (Exception E1){
            System.out.println(E1.getMessage());
        }finally {
            System.out.println("No Matter What i will execute");
        }
    }

   static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Dont provide Zero");
        }

        return a/b;
    }
}
