package BasicJavaConcepts.JavaBasics;
import java.util.*;
import java.util.Scanner;
public class StudentManagementProjectByHashmap {


        public static void main(String[] args) {
            // Create a HashMap to store student name and percentage
            HashMap<String, Double> studentData = new HashMap<>();
            Scanner scanner = new Scanner(System.in);

            //1. Ask user how many students to enter
            System.out.print("Enter number of students: ");
            int n = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            //2. Input student data
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter name of student " + i + ": ");
                String name = scanner.nextLine();

                System.out.print("Enter percentage of " + name + ": ");
                double percentage = scanner.nextDouble();
                scanner.nextLine(); // consume newline

                studentData.put(name, percentage); // Store in map
            }

            //3. Display all/Iterate  student data using entrySet Method
            System.out.println("\n--- Student Records ---");
            for (Map.Entry<String, Double> entry : studentData.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Percentage: " + entry.getValue());
            }


            //4. Search for a student
            System.out.print("\nEnter a name to search: ");
            String searchName = scanner.nextLine();

            if (studentData.containsKey(searchName)) {
                System.out.println(searchName + "'s Percentage: " + studentData.get(searchName));
            } else {
                System.out.println("Student not found.");
            }

            // 5.Remove a student
            System.out.print("\nEnter a name to remove: ");
            String removeName = scanner.nextLine();

            if (studentData.containsKey(removeName)) {
                studentData.remove(removeName);
                System.out.println(removeName + " has been removed.");
            } else {
                System.out.println("Student not found.");
            }

            // 6.Final list of students
            System.out.println("\n--- Final Student List ---");
            for (Map.Entry<String, Double> entry : studentData.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Percentage: " + entry.getValue());
            }

            scanner.close();
        }
    }


