package com.company;
import java.util.Random;
import java.util.Scanner;

public class Ex02_SizerPaperRock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int me = 0;
        int c = 0;

        for (int i=1; i<=5; i++) {

            System.out.println("\n Remember That: ");
            System.out.println("0 is sizer, 1 is rock and 2 is paper");
            System.out.println("\n Choose a valid Number");
            int you = sc.nextInt();


            Random rnd = new Random();
            int comp = rnd.nextInt(3);


            if (comp == 0) {
                System.out.println("\n Comp Choice is Sizer");
            }
            else if (comp == 1) {
                System.out.println("\n Comp Choice is Rock");
            }
            else {
                System.out.println("\n Comp Choice is Paper");
            }


//        0 = sizer
//        1 = rock
//        2 = paper

            if (comp == you) {
                System.out.println("\n Tie");
            }
            else if (comp == 0 && you == 1 || comp == 1 && you == 2 || comp == 2 && you == 0) {
                System.out.println("\n You Win");
                me++;
            }
            else {
                System.out.println("\n Comp Win");
                c++;
            }
        }
        if (me==c){
            System.out.println("\n Final result is :Tie");
        }
        else if (me>c){
            System.out.println("\n Final result is :You Win");
        }
        else {
            System.out.println("\n Final result is :You Lose");
        }


    }
}
