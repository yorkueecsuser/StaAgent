import java.util.*;

class SuspiciousOctalEscape {
    public static void main(String[] args) {
        System.out.println("\038"); // BUG: SuspiciousOctalEscape
        boolean condition = false;
        if (condition) {
            // do nothing
        } else {
            System.out.println("Reachable else block");
        }
    }
}