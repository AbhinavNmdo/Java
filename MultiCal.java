package com.company;
import java.util.Scanner;

public class MultiCal {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter First Number");
        int x =sc.nextInt();
        System.out.println("");

        System.out.println("Enter Second Number");
        int y = sc.nextInt();
        System.out.println("");

        System.out.println("Your Sum Is");
        int sum = x + y;
        System.out.println(sum);
        System.out.println("");

        System.out.println("Your Multiplication Is");
        int mul = x * y;
        System.out.println(mul);
        System.out.println("");

        System.out.println("Your Division Is");
        double div = (double) x / (double) y;
        System.out.println(div);
        System.out.println("");

        System.out.println("Your Subtraction Is");
        int sub = x - y;
        System.out.println(sub);
        System.out.println("");



    }
}
