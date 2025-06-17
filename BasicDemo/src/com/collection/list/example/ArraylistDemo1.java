package com.collection.list.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistDemo1 {
    public static void main(String[] args) {

                List<String> fruits = new ArrayList<>();

                // 1. add(E e)
                fruits.add("Apple");
                fruits.add("Banana");
                fruits.add("Cherry");
                System.out.println("After add(): " + fruits); // [Apple, Banana, Cherry]

                // 2. add(int index, E element)
                fruits.add(1, "Blueberry");
                System.out.println("After add(index, element): " + fruits); // [Apple, Blueberry, Banana, Cherry]

                // 3. addAll(Collection c)
                List<String> tropical = List.of("Mango", "Pineapple");
                fruits.addAll(tropical);
                System.out.println("After addAll(): " + fruits); // [Apple, Blueberry, Banana, Cherry, Mango, Pineapple]

                // 4. addAll(int index, Collection c)
                fruits.addAll(2, List.of("Grapes", "Orange"));
                System.out.println("After addAll(index, collection): " + fruits);
                // [Apple, Blueberry, Grapes, Orange, Banana, Cherry, Mango, Pineapple]

                // 5. get(int index)
                System.out.println("Element at index 3: " + fruits.get(3)); // Orange

                // 6. set(int index, E element)
                fruits.set(3, "Papaya");
                System.out.println("After set(): " + fruits);
                // [Apple, Blueberry, Grapes, Papaya, Banana, Cherry, Mango, Pineapple]

                // 7. remove(Object o)
                fruits.remove("Cherry");
                System.out.println("After remove(Object): " + fruits);

                // 8. remove(int index)
                fruits.remove(0);
                System.out.println("After remove(index): " + fruits);

                // 9. contains(Object o)
                System.out.println("Contains 'Mango'? " + fruits.contains("Mango")); // true

                // 10. indexOf(Object o)
                System.out.println("Index of 'Papaya': " + fruits.indexOf("Papaya")); // 2

                // 11. lastIndexOf(Object o)
                fruits.add("Mango");
                System.out.println("Last index of 'Mango': " + fruits.lastIndexOf("Mango")); // last index

                // 12. size()
                System.out.println("Size: " + fruits.size());

                // 13. isEmpty()
                System.out.println("Is empty? " + fruits.isEmpty()); // false

                // 14. toArray()
                String[] fruitArray = fruits.toArray(new String[0]);
                System.out.print("Array: ");
                for (String f : fruitArray) {
                    System.out.print(f + " ");
                }
                System.out.println();

                // 15.sort
                Collections.sort (fruits);
                System.out.println ("after sorting A to Z :"+fruits );

                // 16. reverse the word by for loop
               System.out.println ("reverse the word by for loop");
                ArrayList<String> reversedList = new ArrayList<> ();
                for(String fruit :fruits){
                    String reversedWord ="";
                    for(int i = fruit.length ()-1;i>=0;i--){
                        reversedWord += fruit.charAt (i);
                    }
                    reversedList.add (reversedWord);
                }
                 System.out.println ("original list : "+ fruits);
                 System.out.println ("reversed word list : "+reversedList);

               // 17.reverse the word by for each method
                   System.out.println ("reverse the word by for each method");
                  ArrayList<String> reversedW = new ArrayList<> ();

                     fruits.forEach (fruit->{
                     String reversed = new StringBuilder (fruit).reverse ().toString ();
                     reversedW.add (reversed) ;
                 });
                   System.out.println (reversedW);

                //17.reverse sort
                Collections.sort (fruits,Collections.reverseOrder ());
                System.out.println ("after sorting Z to A :"+fruits );


                // 18. subList(fromIndex, toIndex)
                List<String> sliced = fruits.subList(1, 4);
                System.out.println("Sublist (1 to 4): " + sliced);

                // 19. clear()
                fruits.clear();
                System.out.println("After clear(): " + fruits); // []


            }
        }



