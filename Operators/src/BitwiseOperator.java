public class BitwiseOperator {

        public static void main(String[] args) {
            int a = 5;   // Binary: 0101
            int b = 3;   // Binary: 0011

            // Bitwise AND
            int andResult = a & b;
            System.out.println("a & b = " + andResult);  // 0101 & 0011 = 0001 => 1

            // Bitwise OR
            int orResult = a | b;
            System.out.println("a | b = " + orResult);   // 0101 | 0011 = 0111 => 7

            // Bitwise XOR
            int xorResult = a ^ b;
            System.out.println("a ^ b = " + xorResult);  // 0101 ^ 0011 = 0110 => 6

            // Bitwise Complement
            int complementA = ~a;
            System.out.println("~a = " + complementA);   // ~0101 = ...1010 => -6

            // Left Shift
            int leftShift = a << 1;
            System.out.println("a << 1 = " + leftShift); // 0101 << 1 = 1010 => 10

            // Right Shift
            int rightShift = a >> 1;
            System.out.println("a >> 1 = " + rightShift);// 0101 >> 1 = 0010 => 2

            // Unsigned Right Shift
            int negative = -8; // Binary: 1111...1000
            int unsignedRightShift = negative >>> 1;
            System.out.println("negative >>> 1 = " + unsignedRightShift); // Fills 0 from left
        }
    }


