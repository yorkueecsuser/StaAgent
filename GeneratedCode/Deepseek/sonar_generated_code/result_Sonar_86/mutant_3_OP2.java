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
        
        // Mutation Operator: Duplication
        // Original Line: byte b = (byte) 0b1000_0000; // -128
        byte duplicate_b = (byte) 0b1000_0000; // -128, a unique mutant
    }
}