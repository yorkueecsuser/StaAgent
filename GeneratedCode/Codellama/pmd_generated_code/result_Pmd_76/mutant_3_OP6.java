import java.util.*;

class SuspiciousOctalEscape {
    public static void main(String[] args) {
        System.out.println("\038"); // BUG: SuspiciousOctalEscape

        // Unreachable for loop
        for (int i = 0; false; i++) {
            // Unreachable code
        }
    }
}