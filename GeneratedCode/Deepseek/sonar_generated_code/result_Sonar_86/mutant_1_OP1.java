import java.lang.System;

class ByteBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        byte b = (byte) 0b1000_0000; // -128
        int i = 1;
        System.out.println(b);
        System.out.println(b << i); // BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        
        // Mutation Operator: Dead Store
        // Reason: Inserting unused variable declarations with one primitive type (for example string, int) to a randomly selected basic book in the program.
        // The name of the variable is a string of eight characters randomly generated in the form of [a-z]. 
        // Only one dead store is added in each transformation by this operator.
        String a12345678 = "This is a dead store, it is meaningless.";
    }
}