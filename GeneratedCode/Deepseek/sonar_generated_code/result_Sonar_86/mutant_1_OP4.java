import java.lang.System;

class ByteBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        byte b = (byte) 0b1000_0000; // -128
        int i = 1;
        System.out.println(b);
        boolean condition = false; // Added Mutant
        if (condition) { // Added Mutant
            System.out.println(b << i); 
        } else {
            System.out.println("This branch will never be executed."); // Added Mutant
        }
    }
}