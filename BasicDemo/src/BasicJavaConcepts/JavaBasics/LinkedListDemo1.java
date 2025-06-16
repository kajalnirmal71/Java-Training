package BasicJavaConcepts.JavaBasics;
import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
public class LinkedListDemo1 {
    public static void main(String[] args) {
        List<String> cities = new LinkedList<> ();

        // 1. add(e element);
        cities.add ("Newyork");
        cities.add ("London");
        cities.add ("Paris");
        cities.add ("China");
        cities.add ("Europe");
        System.out.println (" after add() : " + cities);

        //2.add( int index,element)
        cities.add (2,"Thailand");
        System.out.println ("after add(index,element) :"+ cities);

        //3.update an element at index or replaces
        cities.set (1,"Switzerland");
        System.out.println ("after set () : " + cities);

        //4.remove by index
        cities.remove (2);
        System.out.println ("after remove(index) :"+ cities);

        //5.remove by object
        cities.remove ("China");
        System.out.println ("after remove(object) :"+ cities);

        // 6.get element by index
      String secondCities =  cities.get (1);
        System.out.println ("after get(INDEX) : "+ cities.get (1));

        //7.contains()
        System.out.println ("cities contains 'paris' ? : " + cities.contains ("Paris"));

        //8. get size of list
        System.out.println ("after get size of list :"+ cities.size ());

        // 9.iterate by for loop
        System.out.println ("Iterate using for loop");
        for( int i = 0;i<cities.size ();i++) {
            System.out.println (cities.get (i) + "  ");
        }
         //10.iterate by enhanced for loop
            System.out.println ("Iterate by using enhanced for loop");
            for(String city :cities){
                System.out.println (city + " ");
            }
            System.out.println ();

          //11 .iterate using iterator
        System.out.println ("Iterate using Iterator");
        Iterator<String>iterator = cities.iterator ();
        while(iterator.hasNext ()){
            System.out.println (iterator.next ());
        }
         //12. covert into toArray
        System.out.println ( "convert into array");
        String[]cityArray = cities.toArray (new String[0]);
        for(String C :cityArray) {
            System.out.print (C + " ");
        }
        System.out.println ();

        // 13.sort list
        Collections.sort (cities);
        System.out.println ("after sorting Alphabetically (A TO Z) :" + cities);

        // 14. reverse sort
        Collections.sort (cities,Collections.reverseOrder ());
        System.out.println (" after sorting reverse Alphabetically (Z TO A) :"+ cities);

        // 15.sublist
        List<String>subList = cities.subList (1,2);
        System.out.println ("after sublist : "+subList);

        //16.addAll method
        List<String>moreCities = List.of ("Japan","Italy","America");
        cities.addAll (moreCities);
        System.out.println ("after add ALL method : "+ cities);

        // 17.contains all
        System.out.println (" after contains  all  more cities  ?:"+cities.containsAll (moreCities));

        //18.remove all
        System.out.println (" after remove all  : "+ cities.removeAll (Collections.singleton ("Paris"))+cities);

        // 19.retain all
       System.out.println (" after Retain all : "+cities.retainAll(List.of ("Europe","Newyork","Japan"))+cities);

        //20.list is empty
        System.out.println ("list is empty ? :"+cities.isEmpty ());

        //21 .addFirst(E e)
        cities.addFirst ("India");
        System.out.println ("after addFirst :"+cities);


        // 22. clear the list

        System.out.println ("after clear the list");
        cities.clear ();

        System.out.println ("final List Of cities : "+ cities);
        }
    }

