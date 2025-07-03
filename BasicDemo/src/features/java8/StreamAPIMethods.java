package features.java8;
import java.util.*;
import java.util.stream.*;

public class StreamAPIMethods {
         public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(5, 2, 7, 4, 2, 9, 1, 7, 3, 6);

            // 1. distinct() - remove duplicates
            System.out.println("1. Distinct Numbers:");
            numbers.stream()
                    .distinct()
                    .forEach(System.out::println);

            // 2. filter() - filter even numbers
            System.out.println("n%2. Even Numbers:");
            numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .forEach(System.out::println);

            // 3. map() - square each number
            System.out.println("n*n. Squared Numbers:");
            numbers.stream()
                    .map(n -> n * n)
                    .forEach(System.out::println);

            // 4. sorted() - sort the numbers
            System.out.println("4. Sorted Numbers:");
            numbers.stream()
                    .sorted()
                    .forEach(System.out::println);

            // 5. limit() - take only first 5 numbers
            System.out.println("5. First 5 Numbers:");
            numbers.stream()
                    .limit(5)
                    .forEach(System.out::println);

            // 6. collect() - collect even numbers into a list
            List<Integer> evenList = numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .collect(Collectors.toList());
            System.out.println("6. Collected Even Numbers: " + evenList);

            // 7. reduce() - sum of all numbers
            int sum = numbers.stream()
                    .reduce(0, Integer::sum);
            System.out.println("7. Sum using reduce(): " + sum);

            // 8. count() - count odd numbers
            long oddCount = numbers.stream()
                    .filter(n -> n % 2 != 0)
                    .count();
            System.out.println("8. Count of Odd Numbers: " + oddCount);

            // 9. forEach() - print all numbers
            System.out.println("9. All Numbers using forEach():");
            numbers.forEach(System.out::println);

            // 10. parallelStream() - print using parallel threads
            System.out.println("10. Parallel Stream Output:");
            numbers.parallelStream()
                    .forEach(n -> System.out.println("Number: " + n + " | Thread: " + Thread.currentThread().getName()));
        }
    }


