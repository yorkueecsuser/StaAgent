import java.util.*;

class MathRoundIntLong {
    public static void main(String[] args) {
        int p = 1234567890;
        long q = 1234567890123456789L;
        int r = Math.round(p);
        long s = Math.round(q);
        System.out.println("Rounded int: " + r);
        System.out.println("Rounded long: " + s);
    }
}