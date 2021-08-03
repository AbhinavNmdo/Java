package com.company;

import java.util.Scanner;

class MaxExceptionError extends Exception{
    @Override
    public String toString() {
        return "You've reached your limit";
    }

    @Override
    public String getMessage() {
        return "You've reached your limit";
    }
}

public class Practice14_ErrorsException {
    private static Scanner sc1;

    public static int array(int i) throws MaxExceptionError{
        if (i>2) {
            throw new MaxExceptionError();
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1.
//        Syntax Error
//        int a = 7
//        b = 4;

//        Logical Error
//        int yourAge = 2000;

//        Runtime Error
//        int a = 4;
//        int b = 0;
//        int c = a/b;  // dividing by 0 is an error


//        2.
//        System.out.println("Enter the value do you want to divide");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int i = 0;
//
//        try {
//            int c = a / b;
//        }
//        catch (ArithmeticException e) {
//                System.out.println("HEHE");
//        }
//        catch (IllegalArgumentException r) {
//                System.out.println("HAHA");
//        }


//        3.
//        int [] z = new int[3];
//        z[0] = 4;
//        z[1] = 6;
//        z[2] = 8;
//        boolean flag = true;
//        int l = 0;
//        while (flag && l<5) {
//            try {
//                System.out.println("Enter the number");
//                int k = sc.nextInt();
//                System.out.println(z[k]);
//                break;
//            }
//            catch (Exception ) {
//                System.out.println("Invalid index please enter valid index");
//                l++;
//            }
//        }
//        System.out.println("Error");


//        4.
        int [] z = new int[3];
        z[0] = 4;
        z[1] = 6;
        z[2] = 8;
        int k;
        boolean flag = true;
        int l = 0;
        while (flag && l<5) {
            try {
                System.out.println("Enter the number");
                k = sc.nextInt();
                System.out.println(z[k]);
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid index please enter valid index");
                l++;
            }
        }
        try {
            throw new MaxExceptionError();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
