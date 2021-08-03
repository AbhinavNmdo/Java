package com.company;
import java.util.Scanner;

public class Practice04_Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        1.
//        System.out.println("Marks in Physics out of 100");
//        int phy = sc.nextInt();
//
//        System.out.println("Marks in Maths out of 100");
//        int mat = sc.nextInt();
//
//        System.out.println("Marks in Chem out of 100");
//        int chem = sc.nextInt();
//
//        int per = (phy  + mat + chem) / 3;
//
//        if (phy<33) {
//            System.out.println("Fail");
//        }
//        else if (mat<33) {
//            System.out.println("Fail");
//        }
//        else if (chem<33) {
//            System.out.println("Fail");
//        }
//        else if (per<40) {
//            System.out.println("Fail");
//        }
//        else  {
//            System.out.println("Pass");
//        }

//        2.
//        System.out.println("Enter Your Income in ");
//        float inc = sc.nextFloat();
//        System.out.println("You need to pay tax");
//
//
//        if (inc>250000 && inc<500000) {
//            float a = inc * 0.05f;
//            System.out.println(a);
//        }
//        if (inc>500000 && inc<1000000) {
//            float a = inc * 0.2f;
//            System.out.println(a);
//        }
//        if (inc>1000000) {
//            float a = inc * 0.03f;
//            System.out.println(a);
//        }

//        3.
//        System.out.println("Enter Day Number to find out");
//        byte a = sc.nextByte();
//        if (a<1 && a>7){
//            System.out.println("Enter The Value under 1 to 7");
//        }
//        switch (a){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//            default:
//                System.out.println("Enter the Value under 1 to 7");

//        4.
//        System.out.println("Enter year");
//        int a = sc.nextInt();
//        int b = a / 4;
//        int c = b*4;
//
//        if (a==c){
//            System.out.println("Leap Year");
//        }
//        else {
//            System.out.println("Its Not a Leap Year");
//        }
//
//        5.
        System.out.println("Enter Website");
        String a = sc.next();
        if (a.endsWith("com")) {
            System.out.println("Commercial website");
        }
        else if (a.endsWith("org")) {
            System.out.println("Organisational website");
        }


        }


    }

