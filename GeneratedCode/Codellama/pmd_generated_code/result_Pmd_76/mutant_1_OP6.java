import java.util.*;

class SuspiciousOctalEscape {
    public static void main(String[] args) {
        System.out.println("\038"); // BUG: SuspiciousOctalEscape
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // code
        }
    }
}