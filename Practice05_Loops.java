package com.company;

import java.util.Scanner;

public class Practice05_Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


//        1. Problem

//        int n=0;
//        for (int i=n; i<=5; i++){
//            for (int j=0; j<i; j++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }

        int n = 0;
        for (int i=n; i<6; i++){
            for (int j=1; j<i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
            for (int k=5; k>i; k--){
                System.out.print("1 ");
            }
        }


//        2. Problem
//
//        System.out.println("Enter any Number to get sum");
//        int n = sc.nextInt();
//        int s = 0;
//        int i = 1;
//        while (i<n){
//            s = s + 2*i;
//            i++;
//        }
//        System.out.println(s);

//        3. Problem
//
//        System.out.println("Enter the number of which you want a table");
//        int n = sc.nextInt();
//        for (int i=1; i<=10; i++){
//            int c = i*n;
//            System.out.println(c);
//        }

//        4. Problem
//
//        System.out.println("Multiplication table of 10 is");
//        int n = 10;
//        for (int i=10; i>=1; i--){
//            System.out.printf("%d x %d = %d \n", n, i, n*i);
//        }

//        5. Problem
//
//        int n = 5;
//        int i = 1;
//        int f = 1;
//        while (i<=n){
//            f *= i;
//            i++;
//        }
//        System.out.println(f);

//        6. Problem
//
//        int i = 1;
//        while (i<=5){
//            System.out.println(i);
//            i++;
//        }

//        7. Problem

//        a.
//        int i = 1;
//        while (true){
//            System.out.println(i);
//        }
//        b.
//        for (int u=1; true;){
//            System.out.println(u);
//        }

//        9. Problem

//        int sum = 0;
//        for (int i = 1; i<=10; i++){
//            sum = sum + i*8;
//        }
//        System.out.println(sum);

//        11. Problem
//
//        for (int i= 2; true;){
//            System.out.println(i);
//        }

    }
}
