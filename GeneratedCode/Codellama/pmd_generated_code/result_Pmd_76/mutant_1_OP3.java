import java.util.*;

class SuspiciousOctalEscape {
    public static void main(String[] args) {
        System.out.println("\038"); // BUG: SuspiciousOctalEscape
        boolean condition = getCondition();
        if (condition) {
            // do nothing
        } else {
            System.out.println("This statement is unreachable");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}