package com.company;
import java.util.Random;
import java.util.Scanner;

//class game{
//    public int number;
//    public int guessNumber;
//    public int how;
//
//    void rand(){
//        Random rand = new Random();
//        this.number = rand.nextInt(100);
//    }
//    void userinput (){
//        System.out.println("Enter any value");
//        Scanner sc = new Scanner(System.in);
//        this.guessNumber = sc.nextInt();
//    }
//    boolean isCorrectNumber(){
//        if (number==guessNumber){
//            System.out.println("Yes you are correct");
//            return true;
//        }
//        else if (guessNumber<number) {
//            System.out.println("Too low....");
//        }
//        else {
//            System.out.println("Too high...");
//        }
//        return false;
//    }
//    }
//class GuessTheNumber_Exercise03{
//    public static void main(String[] args) {
//        game g = new game();
//        boolean b = false;
//        g.rand();
//        while (!b) {
//            g.userinput();
//            b = g.isCorrectNumber();
//        }
//    }
//}
