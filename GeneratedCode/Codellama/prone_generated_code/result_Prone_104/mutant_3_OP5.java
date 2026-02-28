import java.util.*;

class MathRoundIntLong {
    public static void main(String[] args) {
        int a = 1234567890;
        long b = 1234567890123456789L;
        int c = Math.round(a);
        long d = Math.round(b);
        System.out.println("Rounded int: " + c);
        System.out.println("Rounded long: " + d);

        // Unreachable switch statement mutant
        int value = getValue();
        switch(value) {
            case 1:
                // code
                break;
            default:
                // code
                break;
        }
    }

    // Helper method to ensure dynamic runtime determination of control structure condition
    public static int getValue() {
        return new Random().nextInt(2);
    }
}