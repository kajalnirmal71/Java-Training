package com.thread.example;


 class ModifierDemo implements Runnable {

        // 1. final - cannot be change
        public final int finalNumber = 100;

        // 2. static - shared among all instances
        public static int staticCounter = 0;

        // 3. static final - compile-time constant
        public static final String APP_NAME = "ModifierApp";

        // 4. transient - not used in serialization here, just declared
        public transient int transientData = 200;

        // 5. volatile - ensures visibility across threads
        public volatile boolean isRunning = true;

        // 6. synchronized method - one thread at a time
        public synchronized void increaseCounter() {
            staticCounter++;
            System.out.println(Thread.currentThread().getName() + " increased counter to " + staticCounter);
        }

        // 7. public variable
        public int publicVar = 10;

        // 8. private variable
        private int privateVar = 20;

        // 9. protected variable
        protected int protectedVar = 30;

        // 10. default (package-private) variable
        int defaultVar = 40;

        @Override
        public void run() {
            while (isRunning) {
                increaseCounter();
                if (staticCounter >= 5) {
                    isRunning = false;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        public void showVariables() {
            System.out.println("\n== Variable States ==");
            System.out.println("publicVar = " + publicVar);
            System.out.println("privateVar = " + privateVar);
            System.out.println("protectedVar = " + protectedVar);
            System.out.println("defaultVar = " + defaultVar);
            System.out.println("finalNumber = " + finalNumber);
            System.out.println("staticCounter = " + staticCounter);
            System.out.println("APP_NAME = " + APP_NAME);
            System.out.println("transientData = " + transientData);
            System.out.println("isRunning = " + isRunning);
        }
    }

    public class  ThreadWithModifier {
        public static void main(String[] args) {
            ModifierDemo obj = new ModifierDemo();

            Thread t1 = new Thread(obj, "Worker-1");
            Thread t2 = new Thread(obj, "Worker-2");

            t1.start();
            t2.start();

            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            obj.showVariables();
        }
    }


