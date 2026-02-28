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
        
        // Mutant Code
        boolean unreachableSwitch = false;
        switch(b) {
            case -128: // This case will never be reached because switch value is a byte and 128 is out of its range.
                unreachableSwitch = true;
                break;
        }
        if (!unreachableSwitch) {
            throw new AssertionError("Unreachable switch statement detected");
        }
    }
}