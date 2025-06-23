package com.thread.example;


class EvenThread extends Thread{

    public void  run() {
        for(int i=2;i<=10;i=i+2){
            try {
                Thread.sleep (1000);
            } catch (InterruptedException e) {
                throw new RuntimeException (e);
            }
            System.out.println ("even : "+i);
        }

    }
}
class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i = i + 2) {
            try {
                Thread.sleep (1000);
            } catch (InterruptedException e) {
                throw new RuntimeException (e);
            }
            System.out.println ("odd : " + i);
        }
    }
}


public class SimpleThreadExample {
    public static void main(String[] args) {
        EvenThread even = new EvenThread ();
        OddThread odd = new OddThread ();

        even.start ();
        odd.start ();
    }
}
