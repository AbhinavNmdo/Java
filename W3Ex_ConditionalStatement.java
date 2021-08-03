package com.company;

import javax.swing.text.Element;
import java.util.Scanner;

public class W3Ex_ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        1.
        /*
        System.out.println("Enter any number to find out weather it is positive or negative");
        int i = sc.nextInt();
        if (i < 0) {
            System.out.println("This is a Negative Number");
        }
        else {
            System.out.println("This number is Positive Number");
        }
         */


//        2.
        /*
        System.out.println("Enter any 3 number to solve quadratic equation");
        System.out.println("Input a");
        int a = sc.nextInt();
        System.out.println("Input b");
        int b = sc.nextInt();
        System.out.println("Input c");
        int c = sc.nextInt();

        double result = b * b - 4 * a * c;

        if (result>0.0) {
            double r1 = (-b + Math.pow(result,0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result,0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 +" and " + r2);
        } else if (result == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The roots are " + r1);
        }
        else {
            System.out.println("The roots are wrong");
        }
         */


//        3.
        /*
        System.out.println("Enter any Number");
        double input = sc.nextDouble();

        if (input<1) {
            if (input<1) {
                System.out.println("Positive small number");
            }
            else if (input>10000) {
                System.out.println("Positive large Number");
            }
            else {
                System.out.println("Positive Number");
            }
        }
        else if (input > 0) {
            if (input < 1) {
                System.out.println("Negative small Number");
            }
            else if (input > 10000) {
                System.out.println("Negative large Number");
            }
            else {
                System.out.println("Negative Number");
            }
        }
        else {
            System.out.println("Zero");
        }
         */


//        5.
        /*
        System.out.println("Enter number to get the day name");
        int k = sc.nextInt();

        if (k <= 7) {
            if (k == 1) {
                System.out.println("Monday");
            } else if (k == 2) {
                System.out.println("Tuesday");
            } else if (k == 3) {
                System.out.println("Wednesday");
            } else if (k == 4) {
                System.out.println("Thursday");
            } else if (k == 5) {
                System.out.println("Friday");
            } else if (k == 6) {
                System.out.println("Saturday");
            } else if (k == 7) {
                System.out.println("Sunday");
            }
        } else {
            System.out.println("Enter correct Index");
        }
         */


//        6.
        /*
        System.out.println("Enter first input");
        double i= sc.nextDouble();
        System.out.println("Enter second input");
        double k = sc.nextDouble();

        i = Math.round(i * 1000);
        System.out.println(i);
        i = i / 1000;
        System.out.println(i);

        k = Math.round(k * 1000);
        k = k / 1000;
        System.out.println(k);

        if (i == k) {
            System.out.println("These are same");
        } else {
            System.out.println("These are different");
        }
         */


//        7.
        /*
        System.out.println("Enter Month number");
        int month = sc.nextInt();
        System.out.println("Enter Year");
        int year = sc.nextInt();

        int noOfDays;
        String nameOfMonth;

        switch (month) {
            case 1:
                nameOfMonth = "January";
                noOfDays = 31;
                System.out.println("In " + nameOfMonth + " there is " + noOfDays + " days");
                break;
            case 2:
                nameOfMonth = "February";
                if (year % 4 == 0) {
                    noOfDays = 29;
                } else {
                    noOfDays = 28;
                }
                System.out.println("In " + nameOfMonth + " there is " + noOfDays + " days");
                break;
            case 3:
                nameOfMonth = "March";
                noOfDays = 31;
                System.out.println("In " + nameOfMonth + " there is " + noOfDays + " days");
                break;
            case 4:
                nameOfMonth= "April";
                noOfDays = 30;
                System.out.println("In " + nameOfMonth + " there is " + noOfDays + " days");
                break;
            case 5:
                nameOfMonth = "May";
                noOfDays = 31;
                System.out.println("In " + nameOfMonth + " there is " + noOfDays + " days");
                break;
            case 6:
                nameOfMonth = "June";
                noOfDays = 30;
                System.out.println("In " + nameOfMonth + " there is " + noOfDays + " days");
                break;
            case 7:
                nameOfMonth = "July";
                noOfDays = 31;
                System.out.println("In " + nameOfMonth + " there is " + noOfDays + " days");
                break;
            case 8:
                nameOfMonth = "August";
                noOfDays = 31;
                System.out.println("In " + nameOfMonth + " there is " + noOfDays + " days");
                break;
            case 9:
                nameOfMonth = "September";
                noOfDays = 30;
                System.out.println("In " + nameOfMonth + " there is " + noOfDays + " days");
                break;
            case 10:
                nameOfMonth = "October";
                noOfDays = 31;
                System.out.println("In " + nameOfMonth + " there is " + noOfDays + " days");
                break;
            case 11:
                nameOfMonth = "November";
                noOfDays = 30;
                System.out.println("In " + nameOfMonth + " there is " + noOfDays + " days");
                break;
            case 12:
                nameOfMonth = "December";
                noOfDays = 31;
                System.out.println("In " + nameOfMonth + " there is " + noOfDays + " days");
                break;
        }
         */


//        8.
        /*
        System.out.println("Enter any character to know the character is vowel or not");
        String str = sc.next();

        if (str.length() <= 1) {
            if (str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")) {
                System.out.println("This is vowel char");
            }
            else if (str.equals("A") || str.equals("E") || str.equals("I") || str.equals("O") || str.equals("U")) {
                System.out.println("This is vowel char");
            }
            else {
                System.out.println("This is not a vowel char");
            }
        } else {
            System.out.println("Enter valid character");
        }
         */


//        9.
        /*
        System.out.println("Enter any year to know weather it is a leap year or not");
        int i = sc.nextInt();

        if (i % 4 == 0) {
            System.out.println("Yes, this is a leap year");
        }
        else {
            System.out.println("No, this is not a leap year");
        }
         */


//        10.
        /*
        System.out.println("Enter number to get first n natural number");
        int i = sc.nextInt();

        for (int k = 1; k<=i; k++) {
            System.out.println(k);
        }
         */


//        11.
        /*
        System.out.println("Enter any interger to get the n natural number of sum");
        int i = sc.nextInt();
        int sum = 0;

        for (int k=1; k<=i; k++) {
            System.out.println(k);
            sum = sum + i;
        }
        System.out.println("And their sum is " + sum);
         */


//        12.
        /*
        System.out.println("Input first value");
        int n = sc.nextInt();
        System.out.println("Input second value");
        int k = sc.nextInt();
        System.out.println("Input third value");
        int l = sc.nextInt();
        System.out.println("Input fourth value");
        int u = sc.nextInt();
        System.out.println("Input fifth value");
        int i = sc.nextInt();

        double avg = (n + k + l + u + i ) / 5d;
        int sum = n + k + l + u + i;

        System.out.println("The average value is " + avg);
        System.out.println("And their sum is " + sum);
         */


//        13.
        /*
        System.out.println("Enter the value to get the cube root to the given number");
        double n = sc.nextInt();

        for (int k=1; k<=n; k++) {
            int l = k * k * k;
            System.out.println("The cube root of " + k + " is " + l);
        }
         */


//        14.
        /*
        System.out.println("Input the number to get the given number table");
        int i = sc.nextInt();

        for (int k=1; k<=10; k++) {
            int l = i * k;
            System.out.println(i + " x " + k + " = " + i*k);
        }
         */


//        15.
        /*
        System.out.println("Input to get the n times of the first odd number and their sum");
        int n = sc.nextInt();
        int l;
        int sum = 0;

        System.out.println("The first n odd numbers are: ");
        for (int k=1; k<=n; k++) {
            l = (2*k)-1;
            System.out.println(l);
            sum = sum + l;
        }
        System.out.println("And thier sum is " + sum);
         */


//        16.
        /*
        System.out.println("Input any value to get the given rows piramid");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int k=1; k<=i; k++) {
                System.out.print(k+ " ");
            }
            System.out.println("");
        }
         */


//        17.
        /*
        System.out.println("Input any number to get the given numbers of rows piramid");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int k=1; k<=i; k++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
         */


//        18.
        /*
        System.out.println("Input the number to get the piramid");
        int n = sc.nextInt();
        int l = 0;

        for (int i=1; i<=n; i++) {
            for (int k=1; k<=i; k++) {
                l++;
                System.out.print(l + " ");
            }
            System.out.println(" ");
        }
         */


//        19.
        /*
        System.out.println("Input the number to get the piramid");
        int n = 5;

        for (int i=1; i<=n; i++) {
            for (int j=5; j>=i; j--) {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print(" " + i);
            }
            System.out.println("");
        }
         */


//        20.
//        Same as the quesction 18


//        21.
        /*
        System.out.println("Input the number to get the piremid");
        int i = 6;

        for (int j=1; j<=i; j++) {
            for (int k=5; k>=j; k--) {
                System.out.print(" ");
            }
            for (int l=1; l<=j; l++ ) {
                System.out.print("*");
            }
            for (int m=2; m<=j; m++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int q=1; q<=i; q++) {
            for (int k=1; k<=q; k++) {
                System.out.print(" ");
            }
            for (int l=5; l>=q; l--) {
                System.out.print("*");
            }
            for (int m=5; m>q; m--) {
                System.out.print("*");
            }
            System.out.println("");

        }
         */


//        22.
//        Same as 21 half


//        23.
        /*
        System.out.println("Input to get the piramid");
        int i = sc.nextInt();

        for (int k=1; k<=i; k++) {
            for (int n=1; n<=k; n++) {
                System.out.print(" ");
            }
            for (int l=i; l>=k; l--) {
                System.out.print("*");
            }
            System.out.println("");
        }
         */


//        24.
        /*
        System.out.println("Input the value to get the piremid");
        int i = sc.nextInt();

        for (int k=1; k<=i; k++) {
            for (int l=i; l>=k; l--) {
                System.out.print(" ");
            }
            for (int n=1; n<=k; n++) {
                System.out.print("@");
            }
            System.out.println(" ");
        }
         */


//        25. & 26.
//        Same as the 21.


//        27.
        /*
        System.out.println("Input the number to know weather it is negative or positive or zero");
        int i = sc.nextInt();

        if (i<0) {
            System.out.println("It is Negative Number");
        } else if (i > 0) {
            System.out.println("It is Positive Number");
        } else {
            System.out.println("It is zero");
        }
         */


//        28.
//        Same is 4.


//        29.
        /*
        System.out.println("Enter the number to know the digits in the integer");
        String str = sc.next();
        System.out.print("The length of your integer is: ");
        System.out.print(str.length());
         */


//        30.
        /*
        System.out.println("Input first number");
        int i = sc.nextInt();
        System.out.println("Input second number");
        int k = sc.nextInt();
        System.out.println("Input third number");
        int l = sc.nextInt();

        if (i==k && k==l) {
            System.out.println("All numbers are same");
        } else if (i == k || i == l || k == l) {
            System.out.println("Neither all are equall");
        } else {
            System.out.println("All are different");
        }
         */


//        31.






    }
}
