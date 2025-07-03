package features.java11;
import java.util.List;



    public class VarInLambdaExample {
        public static void main(String[] args) {
            List<String> names = List.of("Zara", "Bob", "Alex", "Mohan");

            // Sort names in ascending order using lambda with 'var'
            names.stream()
                    .sorted((var name1, var name2) -> name1.compareTo(name2))
                    .forEach(System.out::println);
        }
    }


