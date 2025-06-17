package com.collection.map.example;
import java.util.Map;
import java.util.HashMap;

public class HashMapExample {


        public static void main(String[] args) {
            // 1. Create a HashMap
            Map<String, Integer> studentMarks = new HashMap<>();

            // 2. put() – Add entries
            studentMarks.put("Alice", 85);
            studentMarks.put("Bob", 92);
            studentMarks.put("Charlie", 78);
            studentMarks.put("David", 90);

            // 3. Duplicate key (value will be replaced)
            studentMarks.put("Alice", 88); // Replaces 85

            // 4. Display all entries
            System.out.println("Student Marks: " + studentMarks);

            // 5. get() – Get value by key
            System.out.println("Marks of Bob: " + studentMarks.get("Bob"));

            // 6. containsKey() – Check if a key exists
            System.out.println("Is Charlie in the list? " + studentMarks.containsKey("Charlie"));

            // 7. containsValue() – Check if a value exists
            System.out.println("Is 90 in the marks list? " + studentMarks.containsValue(90));

            // 8. remove() – Remove a key-value pair
            studentMarks.remove("David");

            // 9. size() – Number of entries
            System.out.println("Total students: " + studentMarks.size());

            // 10. isEmpty() – Check if map is empty
            System.out.println("Is the map empty? " + studentMarks.isEmpty());

            // 11. keySet(), values(), entrySet()
            System.out.println("Student names: " + studentMarks.keySet());
            System.out.println("Marks list: " + studentMarks.values());

            // 12. Loop using for-each with entrySet()
            System.out.println("All Entries:");
            for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }

            // 13. clear() – Remove all entries
            studentMarks.clear();
            System.out.println("After clearing: " + studentMarks);
        }
    }


