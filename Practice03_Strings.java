package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Practice03_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1.
        String x = "ABHAY";
        System.out.println(x.toLowerCase(Locale.ROOT));

//        2.
        String y = "a b h a y";
        System.out.println(y.replace(" " , "_"));

//        3.
        String letter = "Hello <|name|> , Thanks a lot";
        letter = letter.replace("<|name|>" , "Abhay");
        System.out.println(letter);

//        4.
        String t = "Hii  have   nice day";
        System.out.println(t.indexOf("  "));
        System.out.println(t.indexOf("   "));

//        5.
        String myletter = "Dear Abhay, \n\t the java course is nice,\n Thanks";
        System.out.println(myletter);


    }
}
