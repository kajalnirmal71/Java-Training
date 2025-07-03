package features.java11;

import java.util.*;
import java.util.HashSet;
import java.util.Set;

class Person {
    private String aadharNumber;
    private String name;
    private int age;

    public Person(String aadharNumber, String name, int age) {
        this.aadharNumber = aadharNumber;
        this.name = name;
        this.age = age;
    }

    // Override equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return this.aadharNumber.equals(person.aadharNumber);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return aadharNumber.hashCode();
    }

    @Override
    public String toString() {
        return name + " (" + aadharNumber + ")";
    }
}

public class EqualsHashEx {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();

        Person p1 = new Person("123456789012", "Snehal", 23);
        Person p2 = new Person("123456789012", "Snehal", 23);  // same Aadhar
        Person p3 = new Person("999999999999", "Aishwarya", 25);    // different Aadhar

        set.add(p1);
        set.add(p2);  // Will NOT be added (duplicate based on Aadhar)
        set.add(p3);

        System.out.println("Unique persons in set:");
        for (Person p : set)
            System.out.println(p);
    }
}



