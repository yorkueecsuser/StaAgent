import java.util.*;

class SuspiciousOctalEscape {
    public static void main(String[] args) {
        System.out.println("\038"); // BUG: SuspiciousOctalEscape

        // Unreachable if statement mutant
        if (false) {
            System.out.println("This statement is unreachable");
        }
    }
}