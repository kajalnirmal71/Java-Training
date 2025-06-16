package BasicJavaConcepts.JavaBasics;
import java.util.*;

public class VectorListExample {


        public static void main(String[] args) {
            // Create a Vector of Integers
            Vector<Integer> numbers = new Vector<>();

            // 1.Add elements
            numbers.add(10);
            numbers.add(20);
            numbers.add(30);
            numbers.add(40);
            numbers.add(20);  // Duplicate value

            //2. Display vector
            System.out.println("Original Vector: " + numbers);

            //3. Add at specific index
            numbers.add(2, 25);
            System.out.println("After adding 25 at index 2: " + numbers);

            //4. Access element by get method
            System.out.println("Element at index 3: " + numbers.get(3));

            //5. Search for element
            System.out.println("Index of 20: " + numbers.indexOf(20));
            System.out.println("Last index of 20: " + numbers.lastIndexOf(20));
            System.out.println("Contains 30? " + numbers.contains(30));

            //6. Remove element by value and index
            numbers.remove(Integer.valueOf(20)); // removes first 20
            numbers.remove(3); // removes element at index 3
            System.out.println("After removals: " + numbers);

            //7. Replace element by set method
            numbers.set(1, 22);
            System.out.println("After setting index 1 to 22: " + numbers);

            // 8.Sublist
            List<Integer> subList = numbers.subList(1, 3);
            System.out.println("Sublist (1 to 3): " + subList);

            // 9.Clone the vector
            Vector<Integer> copy = (Vector<Integer>) numbers.clone();
            System.out.println("Cloned Vector: " + copy);

            //10. retainAll (common elements with another list)
            Vector<Integer> filter = (Vector<Integer>) List.of (10,22,30);
            numbers.retainAll(filter);
            System.out.println("After retainAll: " + numbers);

            // 11.Add all elements from another collection
            Vector<Integer> ADD = (Vector<Integer>) List.of (50,60,70);
            numbers.addAll (ADD);
            System.out.println("After addAll: " + numbers);

            //12. removeAll
            numbers.removeAll(Arrays.asList(10, 50));
            System.out.println("After removeAll: " + numbers);

            //13. Check if empty
            System.out.println("Is vector empty? " + numbers.isEmpty());

            // 14 .Iterate using forEach Method
            System.out.print("Final elements: ");
            numbers.forEach(num -> System.out.print(num + " "));

        }
    }


