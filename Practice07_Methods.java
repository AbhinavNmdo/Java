package com.company;

import jdk.dynalink.beans.StaticClass;

import javax.naming.PartialResultException;
import javax.swing.*;
import java.io.OutputStream;
import java.util.Scanner;

public class Practice07_Methods {

//    1.
//    static void mul(int n){
//        for (int i=1; i<=10; i++){
//            System.out.print(n +" x "+ i +" = " + i*n +"\n" );
//    }
//    }


//    2.
//    static void pattern (int n){
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }
//    }


//    3.
//    static int sum (int n){
//        if (n==1){
//            return 1;
//        }
//        else {
//            return n + sum(n-1);
//        }
//    }


//    4.
//    static void pattern1 (int n){
//        for (int i=0; i<=n; i++){
//            for (int j=n; j>=i; j--){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }
//    }


//    5.
//    a.
//    static void fabo(int k){
//        int p = 0;
//        int n = 1;
//        for (int i=1; i<=k; i++){
//            System.out.print(p + ", ");
//
//            int s = p + n ;
//            p = n;
//            n = s;
//        }

//    }
//    b.
//    static int fib (int l) {
//
//        if (l == 0) {
//            return 0;
//        }
//        else if (l == 2) {
//            return 1;
//        }
//        else {
//            return (fib(l - 1) + fib(l - 2));
//        }
//    }


//    6.
//    static int avg (int ...arr){
//        int i = 0;
//        for (int e: arr){
//            i += e;
//        }
//        return i;
//
//    }


//    7.



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        1.
//        mul(5);
//        mul(6);


//        2.
//        pattern(20);


//        3.
//        sum(4);
//        System.out.println(sum(4));


//        4.
//        pattern1(8);


//        5.
//        a.
//        fabo(10);
//        b.
//        int r = fib(4);
//        System.out.println(r);


//        6.
//        System.out.println(avg(4,2,6) / 3);









    }
}
