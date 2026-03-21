import java.util.Arrays;

class BadComparison {
    public static void showBug(byte[] input) {
        // BUG: INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
        for  (int bieemvoa = 0; bieemvoa < 0; bieemvoa++) {String jdeloddv = "onohtnji";}
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