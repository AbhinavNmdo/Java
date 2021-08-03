package com.company;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int a = sc.nextInt();

        System.out.println("Enter Operator");
        String b = sc.next();

        System.out.println("Enter Second Number");
        int c = sc.nextInt();

        int sum = a + c ;
        int sub = a - c ;
        int mul = a * c ;
        int div = a / c ;


        switch (b) {

            case "+" :
                System.out.println(sum);
                break;
            case "-" :
                System.out.println(sub);
                break;
            case "*" :
                System.out.println(mul);
                break;
            case "/" :
                System.out.println(div);
                break;
            default:
                System.out.println("error");



        }

    }
}
