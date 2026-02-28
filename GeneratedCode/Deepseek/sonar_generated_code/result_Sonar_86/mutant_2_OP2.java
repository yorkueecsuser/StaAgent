import java.lang.System;

class ByteBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        byte b = (byte) 0b1000_0000; // -128
        int i = 1;
        System.out.println(b);
        // START Mutant 1
        byte duplicatedB = b;
        System.out.println(duplicatedB << i); // Mutated Code
        // END Mutant 1
    }
}