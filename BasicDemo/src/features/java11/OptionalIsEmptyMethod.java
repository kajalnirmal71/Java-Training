package features.java11;
import java.util.Optional;

public class OptionalIsEmptyMethod {

        public static void main(String[] args) {
            Optional<String> name = Optional.empty();

            if (name.isEmpty()) {
                System.out.println("Name is not present.");
            } else {
                System.out.println("Name: " + name.get());
            }
        }
    }


