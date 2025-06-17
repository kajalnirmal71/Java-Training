package demo.basic;

import java.util.Scanner;

public class TwoDimentionalArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int rows = sc.nextInt ();
        int columns = sc.nextInt ();

        int[][] numbers = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt ();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
 //2numbers[i][j] = sc.nextInt ();
                System.out.print (numbers[i][j] + " ");
            }
            System.out.println ("");
        }
        boolean isElementFound = false;
        System.out.print (" enter your element");
        int element = sc.nextInt ();
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                if (numbers[i][j] == element) {
                    System.out.println ("elements found" + i + "  " + "  " + j);
                     isElementFound = true;
                     break;
                }
            }
            if( isElementFound)
                break;

            System.out.println (" ");



        }
        if (isElementFound == false){
            System.out.println ("elements is not found");

        }

    }
}

