package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

class Library2 {
    HashSet<String> books = new HashSet<>();
    Calendar c = Calendar.getInstance();
    Date d = new Date();
    void availableBooks() {
        System.out.println("Available books in the library: " + books);
    }

    void addBooks(String a,String name) {
        books.add(a);
        System.out.println("Added by " +name + a + " book, in the Library at " +  d.getDate() + "/" + d.getMonth() + " " + Calendar.HOUR + ":" + Calendar.MINUTE);
    }

    void issueBooks(String b, String name) {
        books.remove(b);
        System.out.println("Issued " + b + " by " + name +   " from the Library at " +  d.getDate() + "/" + d.getMonth() + " " + Calendar.HOUR + ":" + Calendar.MINUTE);
    }

    void returnIssuedBooks(String a, String name) {
        books.add(a);
        System.out.println("Returned by" + name +   " from the Library at " +  d.getDate() + "/" + d.getMonth() + " " + Calendar.HOUR + ":" + Calendar.MINUTE);
    }
}

public class Ex07_Library2 {
    public static void main(String[] args) {
        Library2 l = new Library2();
        l.addBooks("Java", "Abhay");
        l.addBooks("Kotlin", "Abhay");
//        l.addBooks("C", "Abhay");
//        l.addBooks("Python", "Abhay");
//        l.addBooks("C++", "Abhay");
        l.availableBooks();
        l.issueBooks("Java" , "Abhay");
        l.availableBooks();

    }
}
