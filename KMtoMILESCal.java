package com.company;
import java.util.Scanner;

public class KMtoMILESCal {

    public static void main(String[] args) {
        System.out.print("");
          Scanner ji = new Scanner(System.in);
        boolean main = ji.hasNextInt();
        System.out.println(main);

        System.out.println("Enter Km Value");
        double Km = ji.nextDouble();
        double Miles = Km * 0.621;
        System.out.println(Miles);

    }
}
