package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Project15_AdvanceJava {
    public static void main(String[] args) {

//        1.
        ArrayList<String> Students = new ArrayList<>();
        Students.add("Abhay");
        Students.add("Palak");
        Students.add("Ashu");
        Students.add("Bittu");
        Students.add("Shiv");
        Students.add("Shubh");
        Students.add("Aryan");
        Students.add("Jay");
        Students.add("Dhruv");
        Students.add("Shourya");

        for (Object o: Students) {
            System.out.println(o);
        }


//        2.
        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());


//        3.
        Calendar c = Calendar.getInstance();
        System.out.println(Calendar.HOUR + ":" + Calendar.MINUTE + ":" + Calendar.SECOND);


//        4.
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy" + "   " + "hh:mm:ss");
        String format = dt.format(df);
        System.out.println(format);


//        5.
        HashSet<Integer> h = new HashSet<>();
        h.add(5);
        h.add(4);
        h.add(8);
        h.add(3);
        h.add(5);
        System.out.println(h);



    }
}
