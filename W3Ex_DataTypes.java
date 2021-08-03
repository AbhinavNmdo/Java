package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class W3Ex_DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1.
        /*
        System.out.println("Enter Fahrenheit value to get the celsius value");
        double f = sc.nextDouble();
        System.out.println("Celsius value is: ");
        double l = ( f - 32 ) * ( 5 / 9f );
        System.out.println(l);
         */


//        2.
        /*
        System.out.println("Enter Inch value to get Meter value");
        double i = sc.nextDouble();
        System.out.println("Meter value is: ");
        double m = i/39.37f;
        System.out.println(m);
         */


//        3.
        /*
        System.out.println("Input the integer between 0 to 999");
        int i = sc.nextInt();

        int firstdigit = i % 10;
        int remainingone = i / 10;
        int seconddigit = remainingone % 10;
        int thirddigit = remainingone / 10;

        System.out.println("Here is the sum of the digits: ");
        int sum = firstdigit + seconddigit + thirddigit;
        System.out.println(sum);
         */


//        4.
        /*
        System.out.println("Enter the minute value to get the days and year");
        int i = sc.nextInt();

        int year = i / 525600;
        int remaining = i - year;
        int days = (remaining / 1440) % 365;

        System.out.println(i + " Minutes is approx " + year + " Years and " + days + " Days");
         */


//        5.



//        6.
        /*
        System.out.println("Enter your height in meters");
        float height = sc.nextFloat();
        System.out.println("Enter your weight in kg");
        float weight = sc.nextFloat();

        float bmi = weight / (height*height);
        System.out.println("Your BMI is: " + bmi);
         */


//        7.
        /*
        System.out.println("Enter distance in meters");
        int dist = sc.nextInt();
        System.out.println("Enter hours");
        int hour = sc.nextInt();
        System.out.println("Enter minutes");
        int min = sc.nextInt();
        System.out.println("Enter seconds");
        int sec = sc.nextInt();

        System.out.println("Your speed in distance per second is: ");
        double distpersec = (double) dist / (double) ((hour*3600) + (min * 60) + sec);
        System.out.println(distpersec);
        System.out.println("Your speed in kilometer per hour is: ");
        double distkmperhour = (double) (dist / 1000) / (double) (hour + (min / 60) + (sec / 3600));
        System.out.println(distkmperhour);
        System.out.println("Your speed in miles per hour is: ");
        double distmileperhour = (double) (dist / 1609) / (double) (hour + (min / 60) + (sec / 3600));
        System.out.println(distmileperhour);
         */


//        8.
        /*
        System.out.println("Enter the number to get the square root, cube root, and fourth power");
        double input = sc.nextInt();
        double sqroot = (input*input);
        double curoot = (input*input*input);
        double forthpower = (input*input*input*input);
        System.out.println("Square root is: " + sqroot);
        System.out.println("Cube root is: " + curoot);
        System.out.println("Forth Power is: " + forthpower);
         */


//        9.
        /*
        System.out.println("Input first integer");
        double one = sc.nextDouble();
        System.out.println("Input second integer");
        double two = sc.nextDouble();

        double sum = one + two;
        System.out.println("Sum is: " + sum);
        double sub = one - two;
        System.out.println("Difference between is: " + sub);
        double mul = one * two;
        System.out.println("Product is: " + mul);
        double div = one / two;
        System.out.println("Division is: " + div);
        double avg = (one + two) / 2;
        if (one>two) {
            System.out.println("Max integer is: " + one);
            System.out.println("Min integer is: " +two);
        }
        else if (one<two) {
            System.out.println("Max integer is: " + two);
            System.out.println("Min integer is: " + one);
        }
         */


//        10.
        /*
        System.out.println("Enter 6 Non-Negative number");
        int n = sc.nextInt();
        int one = n / 100000 % 10;
        int two = n / 10000 % 10;
        int three = n / 1000 % 10;
        int four = n / 100 % 10;
        int five = n / 10 % 10;
        int six = n % 10;
        System.out.println(one + " " + two + " " + three + " " + four + " " + five + " " + six);
         */


//        12.
        /*
        int n1 = Integer.MAX_VALUE;
        int n2 = Integer.MIN_VALUE;
        System.out.println("Signed Integers: " + n1 + ", " + n2);
        System.out.println("-------------------------------------");
        int compareSigned = Integer.compare(n1, n2);
        System.out.println("Result of Signed Integer is: " + compareSigned);
        int compareUnsigned = Integer.compareUnsigned(n1, n2);
        System.out.println("Result of Unsigned Integer is: " + compareUnsigned);
         */













    }
}
