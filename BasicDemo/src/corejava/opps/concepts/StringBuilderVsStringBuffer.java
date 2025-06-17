package corejava.opps.concepts;

public class StringBuilderVsStringBuffer {
    public static void main(String[] args) {

                int time = 1_000_000;

                // Using StringBuilder
                long start1 = System.currentTimeMillis();
                StringBuilder sb1 = new StringBuilder();
                for (int i = 0; i < time; i++) {
                    sb1.append("a");
                }
                long end1 = System.currentTimeMillis();
                System.out.println("StringBuilder Time: " + (end1 - start1) + " ms");

                 System.out.println ("performance is fast because of  NOT Sychronized /thread safety not required");

                // Using StringBuffer
                long start2 = System.currentTimeMillis();
                StringBuffer sb2 = new StringBuffer();
                for (int i = 0; i < time; i++) {
                    sb2.append("a");
                }
                long end2 = System.currentTimeMillis();
                System.out.println("StringBuffer Time: " + (end2 - start2) + " ms");

                System.out.println ("performance is slow because of multithreaded environment");
            }
        }







