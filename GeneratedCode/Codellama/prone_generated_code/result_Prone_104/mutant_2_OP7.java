import java.util.*;

class MathRoundIntLong {
    public static void main(String[] args) {
        int a = 1234567890;
        long b = 1234567890123456789L;
        int c = Math.round(a);
        long d = Math.round(b);
        System.out.println("Rounded int: " + c);
        System.out.println("Rounded long: " + d);

        // Unreachable while loop
        boolean shouldRun = getCondition();
        while (shouldRun) {
            // This code is unreachable
            System.out.println("This code is unreachable");
        }
    }

    private static boolean getCondition() {
        // Return a random boolean value
        return new Random().nextBoolean();
    }
}