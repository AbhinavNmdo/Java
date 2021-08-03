package com.company;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String name = "  Abhayay ";

//        1.  lengrh of name
        System.out.println(name.length());

//        2.  lower case name
        System.out.println(name.toLowerCase(Locale.ROOT));

//        3.  upper case name
        System.out.println(name.toUpperCase());

//        4.  trim name
        System.out.println(name.trim());

//        5.  substrung name
        System.out.println(name.substring(6));

//        6.  substrung name beg and end
        System.out.println(name.substring(5,10));

//        7. replace char name
        System.out.println(name.replace("y" , "a"));
        System.out.println(name.replace("ay" , "ya"));

//        8.  starts with or not
        String name2 = "Abhay";
        System.out.println(name2.startsWith("A"));
        System.out.println(name2.startsWith("b"));

//        9.  end with or not
        System.out.println(name2.endsWith("y"));
        System.out.println(name2.endsWith("a"));

//        10.  char index
        System.out.println(name.charAt(5));

//        11.  index char
        System.out.println(name.indexOf("h"));

//        12.  index char from
        System.out.println(name.indexOf("h" , 3));

//        13.  index from end
        System.out.println(name.lastIndexOf("y"));

//        14.  index from end
        System.out.println(name.lastIndexOf("y" , 7));

//        15.  equall to name
        System.out.println(name.equals("  Abhayay "));
        System.out.println(name.equals("  abhayay "));

//        16.  equall withoit case
        System.out.println(name.equalsIgnoreCase("  abhayay "));
        System.out.println(name.equalsIgnoreCase("abhay"));

    }
}
