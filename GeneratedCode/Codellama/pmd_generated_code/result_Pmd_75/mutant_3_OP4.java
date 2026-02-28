import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        System.out.println(getHashCode());
    }

    public static int getHashCode() {
        // BUG: SuspiciousHashcodeMethodName
        boolean condition = getCondition();
        if (condition) {
            return 12345;
        } else {
            // Unreachable if-else branch
            return -1;
        }
    }

    private static boolean getCondition() {
        // Method to dynamically determine the condition at runtime
        return false;
    }
}