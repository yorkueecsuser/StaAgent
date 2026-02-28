import java.util.*;

class SuspiciousOctalEscape {
    public static void main(String[] args) {
        System.out.println("\038"); // BUG: SuspiciousOctalEscape

        // Inserted unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // Code that is never executed
        }
    }
}