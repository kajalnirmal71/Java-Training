package BasicJavaConcepts.JavaBasics;
import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {


        // Create a TreeSet
        Set<Integer> numbers = new TreeSet<> ();

        // Add elements
        numbers.add (50);
        numbers.add (10);
        numbers.add (40);
        numbers.add (30);
        numbers.add (20);

        // 1.Display the set (sorted order)
        System.out.println ("TreeSet: " + numbers);


        //2. Duplicate will not be added
        numbers.add (10);
        numbers.add (60);
        System.out.println ("after add method : "+numbers);


        //3. Check if an element exists
        System.out.println ("Contains 30? " + numbers.contains (30));
        System.out.println ("Contains 100? " + numbers.contains (100));

        //4. Remove an element
        numbers.remove (40);
        System.out.println ("After removing 40: " + numbers);

        //5. check size
        System.out.println ("Size of TreeSet: " + numbers.size ());

        //6. Check if empty
        System.out.println ("Is TreeSet empty? " + numbers.isEmpty ());

        //7. Convert to Array
        Integer[] array = numbers.toArray (new Integer[0]);
        System.out.println ("Array from TreeSet: " + Arrays.toString (array));

        //8. Iterate using for-each loop
        System.out.println ("Using for-each loop:");
        for (int num : numbers) {
            System.out.println (num);
        }

        //9. Iterate using Iterator
        System.out.println ("Using Iterator:");
        Iterator<Integer> itr = numbers.iterator ();
        while (itr.hasNext ()) {
            System.out.println (itr.next ());
        }

        // 10.Clear all elements
        numbers.clear ();
        System.out.println ("After clear: " + numbers);
        System.out.println ("Is empty now? " + numbers.isEmpty ());
    }
}


