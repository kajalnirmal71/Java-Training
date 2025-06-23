package corejava.opps.concepts;

public class WrapperClasseExample {

        public static void main(String[] args) {
            // Integer Wrapper
            int a = 10;
            Integer intObj = Integer.valueOf(a);  // Boxing
            System.out.println("Integer object: " + intObj);
            System.out.println("Parsed int: " + Integer.parseInt("100"));
            System.out.println("Max of 10 & 20: " + Integer.max(10, 20));

            // Double Wrapper
            double d = 25.75;
            Double doubleObj = Double.valueOf(d);
            System.out.println("\nDouble object: " + doubleObj);
            System.out.println("Parsed double: " + Double.parseDouble("99.99"));
            System.out.println("Is NaN: " + doubleObj.isNaN());

            // Character Wrapper
            char ch = 'A';
            Character charObj = Character.valueOf(ch);
            System.out.println("\nCharacter object: " + charObj);
            System.out.println("Is digit: " + Character.isDigit('5'));
            System.out.println("Is letter: " + Character.isLetter('A'));
            System.out.println("To lowercase: " + Character.toLowerCase('Z'));

            // Boolean Wrapper
            boolean bool = true;
            Boolean boolObj = Boolean.valueOf(bool);
            System.out.println("\nBoolean object: " + boolObj);
            System.out.println("Parsed boolean: " + Boolean.parseBoolean("true"));
            System.out.println("Boolean compare: " + Boolean.compare(true, false));

            // Float Wrapper
            float f = 10.5f;
            Float floatObj = Float.valueOf(f);
            System.out.println("\nFloat object: " + floatObj);
            System.out.println("Parsed float: " + Float.parseFloat("5.5"));
            System.out.println("Float isInfinite: " + floatObj.isInfinite());

            // Long Wrapper
            long l = 100000L;
            Long longObj = Long.valueOf(l);
            System.out.println("\nLong object: " + longObj);
            System.out.println("Parsed long: " + Long.parseLong("123456789"));
            System.out.println("Long sum: " + Long.sum(100L, 200L));

            // Short Wrapper
            short s = 50;
            Short shortObj = Short.valueOf(s);
            System.out.println("\nShort object: " + shortObj);
            System.out.println("Parsed short: " + Short.parseShort("123"));
            System.out.println("Short compare: " + Short.compare((short) 10, (short) 20));

            // Byte Wrapper
            byte by = 5;
            Byte byteObj = Byte.valueOf(by);
            System.out.println("\nByte object: " + byteObj);
            System.out.println("Parsed byte: " + Byte.parseByte("25"));
            System.out.println("Byte toString: " + byteObj.toString());
        }
    }


