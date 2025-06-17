package corejava.opps.concepts;


    import java.util.Scanner;

    class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public class CustomException {
        public static void checkAge(int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above to register.");
            }
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            try {
                System.out.print("Enter your age: ");
                int age = input.nextInt();

                checkAge(age);
                System.out.println("You are allowed to register.");

            } catch (InvalidAgeException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }


