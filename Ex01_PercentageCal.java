package com.company;
import java.util.Scanner;
public class Ex01_PercentageCal {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Student Name");
        String Name = sc.next();

        System.out.println("Marks in Maths");
        int Maths = sc.nextInt();

        System.out.println("Makrs in English");
        int English = sc.nextInt();

        System.out.println("Marks in Physics");
        int Physics = sc.nextInt();

        System.out.println("Marks in Chemestry");
        int Chemestry = sc.nextInt();

        System.out.println("Marks IN Hindi");
        int Hindi = sc.nextInt();

        int Total = Maths + English + Physics + Chemestry + Hindi;
        float Persentage = (float) Total / 5;

        System.out.println("Total Persentage of :" + Name);
        System.out.println(Persentage);


    }
}
