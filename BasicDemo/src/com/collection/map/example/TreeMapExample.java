package com.collection.map.example;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {


        public static void main(String[] args) {
            // 1. Create a TreeMap
           TreeMap <Integer, String> studentMap = new TreeMap<>();

            // 2. Add entries using put()
            studentMap.put(104, "Ravi");
            studentMap.put(101, "Amit");
            studentMap.put(103, "Neha");
            studentMap.put(102, "Sita");

            // 3. Display all entries (sorted by key)
            System.out.println("Student TreeMap (sorted by roll no): " + studentMap);

            // 4. Get a value using get()
            System.out.println("Roll No 103: " + studentMap.get(103));

            // 5. containsKey() and containsValue()
            System.out.println("Contains roll no 101? " + studentMap.containsKey(101));
            System.out.println("Contains student 'Neha'? " + studentMap.containsValue("Neha"));

            // 6. Remove an entry
            studentMap.remove(104);
            System.out.println("After removing roll no 104: " + studentMap);

            // 7. Iterate using for-each
            System.out.println("Iterating entries:");
            for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
                System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
            }

            // 8. Useful TreeMap-specific methods
            System.out.println("First Entry: " + studentMap.firstEntry());
            System.out.println("Last Key: " + studentMap.lastKey());
            System.out.println("Higher Key than 102: " + studentMap.higherKey(102));
            System.out.println("Lower Entry than 102: " + studentMap.lowerEntry(102));

            // 9. Clear all entries
            studentMap.clear();
            System.out.println("TreeMap after clearing: " + studentMap);
        }
    }


