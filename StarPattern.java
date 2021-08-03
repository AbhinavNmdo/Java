package com.company;

public class StarPattern {
    public static void main(String[] args) {

//        1.
//        for (int i=0; i<=5; i++){
//            for (int j=0; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }

//        2.
//        for (int i=0; i<=5; i++){
//            for (int j=5; j>i; j--){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }

//        3.
        for (int i=0; i<=5; i++){
            for (int j=4; j>=i; j--){
                System.out.print("  ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

//        4.
//        for (int i=0; i<5; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print("  ");
//            }
//            for (int k=4; k>=i; k--){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }


//        5.
//        for (int i=1; i<=6; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }
//        for (int i=1; i<=6; i++){
//            for (int l=6; l>=i; l--);{
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }



    }
}