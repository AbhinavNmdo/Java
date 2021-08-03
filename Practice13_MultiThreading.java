package com.company;

//1.
class MyThread extends Thread {
    public void run() {
        while (true) {
//            2.
            try {
                Thread.sleep(200);
            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
        }
    }
}

public class Practice13_MultiThreading {
    public static void main(String[] args) {
        MyThread p = new MyThread();
        MyThread2 p2 = new MyThread2();
//        3.
        p.setPriority(7);
        p2.setPriority(8);
        System.out.println(p.getPriority());
        System.out.println(p2.getPriority());
//        4.
        p.start();
        p2.start();
        System.out.println(p.getState());
        System.out.println(p2.getState());
//        5.
        System.out.println(Thread.currentThread().getState());

    }
}
