package com.collection.set.example;
import java.util.Iterator;
import java.util.*;

public class LinkedHashSetDemo {

    public static void main(String[] args) {


            // 1. Create a LinkedHashSet
            Set<String> fruits = new LinkedHashSet<> ();

            // 2. add() – Adding elements
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Mango");
            fruits.add("Orange");

            // 3. Attempt to add duplicate
            fruits.add("Apple");

            // 4. Display elements
            System.out.println("Fruits: " + fruits); // [Apple, Banana, Mango, Orange]

            // 5. size() – Total elements
            System.out.println("Size: " + fruits.size()); // 4

            // 6. contains() – Check if element exists
            System.out.println("Contains Mango? " + fruits.contains("Mango")); // true

            // 7. remove() – Remove specific element
            fruits.remove("Banana");
            System.out.println("After removing Banana: " + fruits);

            // 8. isEmpty() – Check if set is empty
            System.out.println("Is empty? " + fruits.isEmpty()); // false

            // 9. Iterating using for-each loop
            System.out.println("Iterating with for-each:");
            for (String fruit : fruits) {
                System.out.println(fruit);
            }

            // 10. Iterating using Iterator
            System.out.println("Iterating with Iterator:");
            Iterator<String> it = fruits.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }

            // 11. clear() – Remove all elements
            fruits.clear();
            System.out.println("After clear(): " + fruits); // []

            // 12. isEmpty() after clearing
            System.out.println("Is empty now? " + fruits.isEmpty()); // true
        }
    }


