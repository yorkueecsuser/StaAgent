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

        // Unreachable for loop mutant
        for (boolean condition = false; condition; ) {
            System.out.println("Unreachable for loop");
            break; // to avoid unreachable statement error
        }
    }
}