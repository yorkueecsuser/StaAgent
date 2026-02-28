import java.util.*;

class SuspiciousOctalEscape {
    public static void main(String[] args) {
        System.out.println("\038"); // BUG: SuspiciousOctalEscape
        boolean condition = getCondition(); // insert new code
        if (condition) {
            System.out.println("Reachable code");
        } else {
            System.out.println("Unreachable code");
        }
    }

    static boolean getCondition() {
        // this method returns a non-final variable to avoid compile-time constants
        return new Random().nextBoolean();
    }
}