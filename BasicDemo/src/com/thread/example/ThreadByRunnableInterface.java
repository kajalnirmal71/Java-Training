package com.thread.example;

import static java.lang.Thread.sleep;

class EvenTask implements Runnable {
        public void run() {

            for (int i = 2; i <= 10; i=i +2) {
                System.out.println("Even: " + i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException (e);
                }
            }
        }
    }

    class OddTask implements Runnable {
        public void run() {
            for (int i = 1; i <= 10; i=i+2) {
                System.out.println("Odd: " + i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException (e);
                }
            }
        }
    }

    public class ThreadByRunnableInterface {
        public static void main(String[] args) {
            Thread evenThread = new Thread(new EvenTask());
            Thread oddThread = new Thread(new OddTask());

            evenThread.start();
            oddThread.start();
        }
    }


