import java.util.*;

class SuspiciousOctalEscape {
    public static void main(String[] args) {
        System.out.println("\038"); // BUG: SuspiciousOctalEscape
        boolean condition = getCondition();
        while (condition) {
            // code
        }
    }

    private static boolean getCondition() {
        return false;
    }
}