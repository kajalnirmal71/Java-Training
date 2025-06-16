package BasicJavaConcepts.JavaBasics;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

                // Create a Set
                Set<String> fruits = new HashSet<> ();

                // Add elements
                fruits.add("Apple");
                fruits.add("Banana");
                fruits.add("Orange");
                fruits.add("Grapes");


                //1. Display the Set
                System.out.println("Fruits Set: " + fruits);

                // 2.Duplicate elements are not added
                fruits.add("Apple");
                fruits.add ("Pineapple");
                    System.out.println ("after add  : "+fruits);




                //3. Check if set contains an element
                System.out.println("Contains 'Banana': " + fruits.contains("Banana"));
                System.out.println("Contains 'Mango': " + fruits.contains("Mango"));

                //4. Remove an element
                fruits.remove("Orange");
                System.out.println("After removing Orange: " + fruits);

                //5. Get size of the set
                System.out.println("Size of set: " + fruits.size());

                // 6.Check if set is empty
                System.out.println("Is set empty? " + fruits.isEmpty());

                //7. Iterate using for-each
                System.out.println("Iterating using for-each:");
                for (String fruit : fruits) {
                    System.out.println(fruit);
                }

                //8. Iterate using Iterator
                System.out.println("Iterating using Iterator:");
                Iterator<String> iterator = fruits.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }

                //9. Convert to array
                Object[] fruitArray = fruits.toArray();
                System.out.println("Array: " + Arrays.toString(fruitArray));

                // 10.Clear all elements
                fruits.clear();
                System.out.println("After clearing set: " + fruits);
                System.out.println("Is set empty now? " + fruits.isEmpty());
            }
        }




