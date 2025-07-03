package features.java11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Comparator: sort by name
class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

// Comparator: sort by marks
class MarksComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.marks - s1.marks;  // descending
    }
}
public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Snehal", 94));
        list.add(new Student(1, "Aishwarya", 92));
        list.add(new Student (2, "Kajal", 90));

        System.out.println("\n🔹 Sort by Name (Comparator):");
        Collections.sort(list, new NameComparator());
        for (Student s : list)
            System.out.println(s);

        System.out.println("\n🔹 Sort by Marks Descending (Comparator):");
        Collections.sort(list, new MarksComparator());
        for (Student s : list)
            System.out.println(s);
    }
}



