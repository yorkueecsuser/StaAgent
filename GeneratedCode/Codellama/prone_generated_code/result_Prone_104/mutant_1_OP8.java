import java.util.*;

class MathRoundIntLong {
    public static void main(String[] args) {
        int a = 1234567890;
        long b = 1234567890123456789L;
        int c = Math.round(a);
        long d = Math.round(b);
        System.out.println("Rounded int: " + c);
        System.out.println("Rounded long: " + d);
    }
}

// mutant code
class MathRoundIntLong {
    public static void main(String[] args) {
        int a = 1234567890;
        long b = 1234567890123456789L;
        int c = Math.round(a);
        long d = Math.round(b);
        System.out.println("Rounded int: " + c);
        System.out.println("Rounded long: " + d);

        // added code
        int e = 1234567890;
        long f = 1234567890123456789L;
        int g = Math.round(e);
        long h = Math.round(f);
        System.out.println("Rounded int: " + g);
        System.out.println("Rounded long: " + h);
    }
}