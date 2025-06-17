package com.collection.map.example;
import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {


        public static void main(String[] args) {
            // 1. Create a LinkedHashMap
            Map<String, String> studentCities = new LinkedHashMap<>();

            // 2. Add key-value pairs using put()
            studentCities.put("Amit", "Mumbai");
            studentCities.put("Neha", "Delhi");
            studentCities.put("Ravi", "Chennai");
            studentCities.put("Sita", "Kolkata");

            // 3. Add a null key and null values
            studentCities.put(null, "Hyderabad");     // only one null key allowed
            studentCities.put("Rahul", null);         // null value allowed
            studentCities.put("Meena", null);

            // 4. Display map content (in insertion order)
            System.out.println("Student Cities: " + studentCities);

            // 5. get() – Get value by key
            System.out.println("City of Amit: " + studentCities.get("Amit"));

            // 6. containsKey() & containsValue()
            System.out.println("Contains key 'Neha'? " + studentCities.containsKey("Neha"));
            System.out.println("Contains value 'Kolkata'? " + studentCities.containsValue("Kolkata"));

            // 7. remove() – Remove a key
            studentCities.remove("Sita");
            System.out.println("After removing Sita: " + studentCities);

            // 8. Iterate using for-each loop
            System.out.println("Iterating through entries:");
            for (Map.Entry<String, String> entry : studentCities.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }

            // 9. size(), isEmpty()
            System.out.println("Size: " + studentCities.size());
            System.out.println("Is map empty? " + studentCities.isEmpty());

            // 10. clear() – Remove all entries
            studentCities.clear();
            System.out.println("Map after clear: " + studentCities);
        }
    }


