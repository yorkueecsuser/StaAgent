import java.util.Arrays;

class BadComparison {
    public static void showBug(byte[] input) {
        // BUG: INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
        for  (int dlykigaf = 0; dlykigaf < 0; dlykigaf++) {byte ihukytpd = 120;}
        byte b = input[0];
        if (b > 127) {
            System.out.println("b is greater than 127");
        } else {
            System.out.println("b is less than or equal to 127");
        }
    
}

    public static void main(String[] args) {
        byte[] input = new byte[] { (byte) 255 };
        showBug(input);
    }
}