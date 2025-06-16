package BasicJavaConcepts.JavaBasics;
import java.util.Stack;

public class StackExampleDemo {

        public static void main(String[] args) {
            Stack<String> stack = new Stack<>();

            //  1. push(E item): Add elements to stack
            stack.push("Java");
            stack.push("Python");
            stack.push("C++");
            stack.push("JavaScript");

            System.out.println("Stack after push(): " + stack);

            //  2. peek(): View top element without removing
            System.out.println("Top element (peek): " + stack.peek());

            // 3. pop(): Remove top element
            String removed = stack.pop();
            System.out.println("Removed element (pop): " + removed);
            System.out.println("Stack after pop(): " + stack);

            //  4. search(Object o): Find 1-based position from top
            int pos = stack.search("Python");
            System.out.println("Position of 'Python' from top: " + pos);

            //  5. isEmpty(): Check if stack is empty
            System.out.println("Is the stack empty? " + stack.isEmpty());

            // 6. size(): Number of elements in stack
            System.out.println("Size of stack: " + stack.size());

            //  7. contains(Object o): Check if element exists
            System.out.println("Does stack contain 'C++'? " + stack.contains("C++"));

            //  8. get(int index): Access element by index (inherited from Vector)
            System.out.println("Element at index 1: " + stack.get(1));  // Note: index is 0-based

            // 9. set(int index, E element): Replace element at index
            stack.set(0, "Kotlin");
            System.out.println("Stack after set(0, 'Kotlin'): " + stack);

            // 10. clear(): Remove all elements
            stack.clear();
            System.out.println("Stack after clear(): " + stack);
        }
    }


