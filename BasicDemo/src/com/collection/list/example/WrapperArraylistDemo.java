package com.collection.list.example;
import java.util.ArrayList;
import java.util.List;

public class WrapperArraylistDemo {


        public static void main(String[] args) {

            //  ArrayList of Integer (wrapper of int)
            List<Integer> numbers = new ArrayList<> ();

            // Autoboxing: primitive int to Integer object
            numbers.add(10); // int -> Integer
            numbers.add(20);
            numbers.add(30);

            //  ArrayList of Double (wrapper of double)
            ArrayList<Double> prices = new ArrayList<>();
            prices.add(99.99);  // double -> Double
            prices.add(49.50);
            prices.add(150.75);

            // ArrayList of Character (wrapper of char)
            ArrayList<Character> grades = new ArrayList<>();
            grades.add('A');
            grades.add('B');
            grades.add('C');

            //  ArrayList of Boolean (wrapper of boolean)
            ArrayList<Boolean> flags = new ArrayList<>();
            flags.add(true);
            flags.add(false);

            // Display all lists
            System.out.println("Integer List: " + numbers);
            System.out.println("Double List: " + prices);
            System.out.println("Character List: " + grades);
            System.out.println("Boolean List: " + flags);

            // Unboxing and using values
            int firstNumber = numbers.get(0);     // unboxing
            double firstPrice = prices.get(0);    // unboxing
            char firstGrade = grades.get(0);      // unboxing

            System.out.println("\nFirst Number: " + firstNumber);
            System.out.println("First Price: " + firstPrice);
            System.out.println("First Grade: " + firstGrade);

            // Using wrapper class method
            String priceStr = Double.toString(firstPrice);
            boolean check = Boolean.parseBoolean("true");

            System.out.println("\nPrice as String: " + priceStr);
            System.out.println("Parsed Boolean: " + check);
        }
    }


