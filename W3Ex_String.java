package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Calendar;

public class W3Ex_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1.
        /*
        String str = "Java Exercises!";
        System.out.println(str.charAt(5));

         */


//        2.
        /*
        String str = "w3resource.com";
        System.out.println(str.codePointAt(6));

         */


//        3.
        /*
        String str = "w3resource.com";
        System.out.println("Unicode before: " + str.codePointBefore(6));

         */


//        4.
        /*
        String str = "w3resource.com";
        System.out.println("Unicode point: " + str.codePointCount(3,5));

         */


//        5.
        /*
        String str1 = "'This is Exercise 1'";
        String str2 = "'This is Exercise 2'";

        int result = str1.compareTo(str2);

        if (result<0){
            System.out.println(str1 + " is less than " + str2);
        } else if (result == 0) {
            System.out.println(str1 + " is equall to " + str2);
        } else {
            System.out.println(str1 + " is grater then " + str2);
        }

         */


//        6.
        /*
        String str1 = "'This is Exercise 1'";
        String str2 = "'This is Exercise 2'";

        int result = str1.compareToIgnoreCase(str2);

        if (result<0){
            System.out.println(str1 + " is less than " + str2);
        } else if (result == 0) {
            System.out.println(str1 + " is equall to " + str2);
        } else {
            System.out.println(str1 + " is grater then " + str2);
        }

         */


//        7.
        /*
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";

        String str3 = str1.concat(str2);
        System.out.println(str3);

         */


//        8.
        /*
        String str1 = "PHP Exercises and Python Exercises";
        System.out.println(str1.contains("and"));

         */


//        9. and 10.
        /*
        String str1 = "Example.com";
        String str2 = "example.com";

        System.out.println(str1.contentEquals(str2));
        System.out.println(str2.contentEquals(str1));

         */


//        11.
        /*
        char [] arrnum = new char[] {'1', '2', '3', '4'};
        String str = String.copyValueOf(arrnum, 1, 3);
        System.out.println("The book contains "+str+ " pages");

         */


//        12.
        /*
        String str = "Python Exercises";
        System.out.println(str.endsWith("es"));

         */


//        13.
        /*
        String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "Mike Royko";

        System.out.println(columnist1.equals(columnist2));
        System.out.println(columnist1.equals(columnist3));
        System.out.println(columnist1.equals(columnist1));

         */


//        14.
        /*
        String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "Mike Royko";

        System.out.println(columnist1.equalsIgnoreCase(columnist2));
        System.out.println(columnist1.equalsIgnoreCase(columnist3));
        System.out.println(columnist1.equalsIgnoreCase(columnist1));

         */


//        15.
        /*
        Calendar c = Calendar.getInstance();
        System.out.println("Current Date and Time: ");
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);

         */


//        17.
        /*
        String str = "This is my String";
        char [] cha = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        str.getChars(2,4, cha, 6);
        System.out.println(cha);

         */


//        18.
        /*
        String str = "Python Exercises.";
        System.out.println("The unique code of this string is: "+ str.hashCode());

         */


//        19.
        String str = "The quick brown fox jumps over the lazy dog.";

        int a = str.indexOf("a",0);
        int b = str.indexOf("b",0);
        int c = str.indexOf("c",0);
        int d = str.indexOf("d",0);
        int e = str.indexOf("e",0);
        int f = str.indexOf("f",0);
        int g = str.indexOf("g",0);
        int h = str.indexOf("h",0);
        int i = str.indexOf("i",0);
        int j = str.indexOf("j",0);
        int k = str.indexOf("k",0);
        int l = str.indexOf("l",0);
        int m = str.indexOf("m",0);
        int n = str.indexOf("n",0);
        int o = str.indexOf("o",0);
        int p = str.indexOf("p",0);
        int q = str.indexOf("q",0);
        int r = str.indexOf("r",0);
        int s = str.indexOf("s",0);
        int t = str.indexOf("t",0);
        int u = str.indexOf("u",0);
        int v = str.indexOf("v",0);
        int w = str.indexOf("w",0);
        int x = str.indexOf("x",0);
        int y = str.indexOf("y",0);
        int z = str.indexOf("z",0);

        System.out.println("a  b  c  d  e  f  g  h  i  j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z");
        System.out.println("===================================================================================");
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h + " " + i + " " + j + " " + k + " " + l + " " + m + " " + n + " " + o + " " + p + " " + q + " " + r + " " + s + " " + t + " " + u + " " + v + " " + w + " " + x + " " + y + " " + z + " ");










    }
}
