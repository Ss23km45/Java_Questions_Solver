package org.example.oops.regex;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample {
    public static void main(String[] args) throws IOException {
        String number = "9494949494";
        RegExExample.checkMobileNumber(number);
        String email = "satyas23km45@vh.co.in";
        RegExExample.checkEmailId(email);

        PrintWriter pw = new PrintWriter("E:/Movies/input.txt") ;
        FileReader fr = new FileReader("E:/Movies/output.txt");
        BufferedReader br = new BufferedReader(fr);
        Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
        String line = br.readLine();

        while(line != null){
            Matcher m = p.matcher(line);
            while(m.find()){
                pw.println(m.group());
            }
            line = br.readLine();
        }
        pw.flush();
        pw.close();
        br.close();
    }

    static void checkMobileNumber(String mobile){

        //Mobile Number should alays starts with 6,7,8,9
        //  [6-9][0-9]{9}
        //Mobile number should contain 10 digits
        // [0-9]{10}
        //mobile may contain country code +91
        // [+91] (0|\\+91)[6-9][0-9]{9}
        //mobile number may contain 0 at the start if out of state
        // [0]
        Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
        Matcher m = p.matcher(mobile);
        if(m.find() && m.group().equalsIgnoreCase(mobile)){
            System.out.println("This is a valid mobile number");
        }else{
        System.out.println("This is not a valid mobile number"); }
    }


    static void checkEmailId(String Email){
        //email always should starts with character
        // [a-zA-Z]
        //email may contain any length
        // [a-zA-Z0-9_]*
        //Email should contain @ symbol
        //@
        //Email gmail.com, co.in, citi.co.in
        // [a-zA-Z]+[.][[a-zA-Z.]+]*

        Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_]*@[a-zA-Z]+.[[a-zA-Z.]+]*");
        Matcher m = p.matcher(Email);
        if(m.find() && m.group().equalsIgnoreCase(Email)){
            System.out.println("This is a valid Email ID");
        }else{
            System.out.println("This is not a valid Email ID"); }

    }

}
