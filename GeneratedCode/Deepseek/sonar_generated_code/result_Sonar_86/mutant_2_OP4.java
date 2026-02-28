import java.lang.System;

class ByteBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        byte b = (byte) 0b1000_0000; // -128
        int i = 1;
        System.out.println(b);
        if (b > i) { // This if statement makes the line below unreachable
            System.out.println(b << i);
        }
    }
}