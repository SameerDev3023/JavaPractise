public class Operators {
    
    public static void main(String[] args){
        // =============== JAVA OPERATORS =======

        // JAVA OPERATORS ARE USED TO PERFORM OPERATIONS ON VARIABLES AND THEIR VALUES.

        // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= ARITHMETIC OPERATORS -=-=-=-=-=-=-=-=-=-=-=- 
        // + , - , /, %, ++ , --

        int a = 10;
        int b = 5;

        int sum = a + b; // Addition
        int difference = a - b; // Subtraction
        int product = a * b; // Multiplication
        int quotient = a / b; // Division
        int remainder = a % b; // Modulus

        a++; // Increment
        b--; // Decrement

        // -=-=-=-=-=-=--=-=-=-=--=-=-=- ASSIGNMENT OPERATORS -=-=-=-=-=-=- 
        // = , += , -= , *= , /= , %=

        int c = 15;
        c += 5; // Equivalent to c = c + 5
        c -= 3; // Equivalent to c = c - 3
        c *= 2; // Equivalent to c = c * 2
        c /= 4; // Equivalent to c = c / 4
        c %= 2; // Equivalent to c = c % 2

        // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= COMPARISON OPERATORS -=-=-=-=-=-=-=-=-=-=-=- 
        // == , != , > , < , >= , <=

        boolean isEqual = (a == b); // Check if equal
        boolean isNotEqual = (a != b); // Check if not equal
        boolean isGreater = (a > b); // Check if greater
        boolean isLess = (a < b); // Check if less
        boolean isGreaterOrEqual = (a >= b); // Check if greater or equal
        boolean isLessOrEqual = (a <= b); // Check if less or equal

        // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= LOGICAL OPERATORS -=-=-=-=-=-=-=-=-=-=-=- 
        // && , || , !

        boolean x = true;
        boolean y = false;

        boolean andResult = x && y; // Logical AND
        boolean orResult = x || y; // Logical OR
        boolean notResult = !x; // Logical NOT

        // -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= BITWISE OPERATORS -=-=-=-=-=-=-=-=-=-=-=- 
        // & , | , ^ , ~ , << , >> , >>>

        int bitwiseAnd = a & b; // Bitwise AND
        int bitwiseOr = a | b; // Bitwise OR
        int bitwiseXor = a ^ b; // Bitwise XOR
        int bitwiseComplement = ~a; // Bitwise Complement
        int leftShift = a << 2; // Left shift
        int rightShift = a >> 2; // Right shift
        int unsignedRightShift = a >>> 2; // Unsigned right shift

        // Printing results
        System.out.println("Arithmetic Operations:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        
        System.out.println("\nAssignment Operations:");
        System.out.println("c after += 5: " + c);
        
        System.out.println("\nComparison Operations:");
        System.out.println("a == b: " + isEqual);
        System.out.println("a != b: " + isNotEqual);
        System.out.println("a > b: " + isGreater);
        System.out.println("a < b: " + isLess);
        System.out.println("a >= b: " + isGreaterOrEqual);
        System.out.println("a <= b: " + isLessOrEqual);
        
        System.out.println("\nLogical Operations:");
        System.out.println("x && y: " + andResult);
        System.out.println("x || y: " + orResult);
        System.out.println("!x: " + notResult);
        
        System.out.println("\nBitwise Operations:");
        System.out.println("a & b: " + bitwiseAnd);
        System.out.println("a | b: " + bitwiseOr);
        System.out.println("a ^ b: " + bitwiseXor);
        System.out.println("~a: " + bitwiseComplement);
        System.out.println("a << 2: " + leftShift);
        System.out.println("a >> 2: " + rightShift);
        System.out.println("a >>> 2: " + unsignedRightShift);
    }
}
