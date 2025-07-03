package features.java11;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Comparable: sort by id (natural order)
    public int compareTo(Student s) {
        return this.id - s.id;  // ascending
    }

    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class ComparableInterface{
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Snehal", 94));
        list.add(new Student(1, "Aishwarya", 92));
        list.add(new Student(2, "Kajal", 90));

        System.out.println("🔹 Sort by ID (Comparable):");
        Collections.sort(list);  // uses compareTo()
        for (Student s : list)
            System.out.println(s);


    }
}

