package com.collection.list.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        List<String>employees = new ArrayList<> ();
        // 1.add() method
        employees.add ("kajal");
        employees.add ("shital");
        employees.add ("charlie");
        employees.add ("ketan");
        System.out.println ("after add() : "+employees);

        // 2.add(int index , E element)
        employees.add (2,"ronald");
        System.out.println ("after add (index,element): " +employees);

        //3.addAll(collection c)
        List<String>newHires =List.of("grace,frank");
        employees.addAll (newHires);
        System.out.println ("after addAll() : " + employees);

        //4.addAll(int index,collection c)
        employees.addAll (3,List.of ("david","hank"));
        System.out.println ("after addAll(index,collection): "+employees);

        // 5. get(int index)
        System.out.println ("employee at index 4 : "+employees.get (4));

        // 6.set(int index,E element)
        employees.set (4,"jolly");
        System.out.println ("after set() : "+employees);

        //7.remove(object o)
        employees.remove ("charlie");
        System.out.println ("after remove(object) :" + employees);

        //8.remove( int index)
        employees.remove (1);
        System.out.println ("after remove (index) :"+ employees);

        //9.contains(object)
        System.out.println ("contains 'ronald' ? :"+ employees.contains ("ronald"));

        //10.indexOf(object o)
        System.out.println ("indexOf 'hank' :"+employees.indexOf ("hank"));

        //11. lastIndexOf(object 0)
        employees.add("jolly");
        System.out.println ("last index of 'jolly' : "+employees.lastIndexOf ("jolly"));

        //12.size()
        System.out.println (" total employees : "+ employees.size ());

        // 13.isEmpty()
        System.out.println ("Is employees list is empty : "+employees.isEmpty ());

        //14.toArray()
        Object[]empArray = employees.toArray ();
        System.out.println ("employee array : ");
        for(Object emp : empArray) {
            System.out.print (emp + " ");
        }
        System.out.println ();

        // 15.Sorting A to Z
        Collections.sort (employees);
        System.out.println (" After sorting A to Z  :"+employees);

        // 16. reverse the word
        ArrayList<String> reversedNameList = new ArrayList<> ();
        for(String name : employees){
            String reverseName = "";
            for(int i =name.length ()-1;i>=0;i--){
                reverseName += name.charAt (i);
            }

            reversedNameList.add (reverseName);
        }
        System.out.println ("original employees list :"+employees);
        System.out.println ("after reversing the name  : "+reversedNameList);



        //17.reverse sorting
        Collections.sort (employees,Collections.reverseOrder ());
        System.out.println ("After reverse sorting z to A :"+employees);

        // 18. sublist (fromIndex,toIndex)
        List<String>subTeam = employees.subList (2,4);
        System.out.println ("subTeam (2 to 4) : "+ subTeam);

        // 19.clear()
        employees.clear ();
        System.out.println ("after clear () : "+ employees);


    }
}
