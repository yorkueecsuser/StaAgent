import java.util.*;

class SuspiciousOctalEscape {
    public static void main(String[] args) {
        System.out.println("\038"); // BUG: SuspiciousOctalEscape
        for (int i = 0; false; i++) {
            // unreachable code
            System.out.println("This code is unreachable");
        }
    }
}