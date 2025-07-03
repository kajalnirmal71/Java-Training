package features.java11;
import java.util.stream.Stream;

public class NewStringMethods {

        public static void main(String[] args) {

            String blank = "   ";
            System.out.println("isBlank: " + blank.isBlank()); // true

            String withSpaces = "  Hello Java  ";
            System.out.println("Original: [" + withSpaces + "]");
            System.out.println("strip: [" + withSpaces.strip() + "]");             // "Hello Java"
            System.out.println("stripLeading: [" + withSpaces.stripLeading() + "]"); // "Hello Java  "
            System.out.println("stripTrailing: [" + withSpaces.stripTrailing() + "]"); // "  Hello Java"

            String word = "Hi ";
            System.out.println("repeat: " + word.repeat(3)); // "Hi Hi Hi "

            String multiLine = "Line1\nLine2\r\nLine3";
            System.out.println("lines():");
            Stream<String> lines = multiLine.lines();
            lines.forEach(System.out::println);
        }
    }


