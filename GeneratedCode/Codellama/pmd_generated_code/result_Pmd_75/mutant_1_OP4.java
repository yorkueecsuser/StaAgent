import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        System.out.println(getHashCode());
    }

    public static int getHashCode() {
        // BUG: SuspiciousHashcodeMethodName
        if (false) { // Unreachable if-else statement mutation
            return 0; // This branch is always false, making it unreachable
        } else {
            return 12345; // The original code
        }
    }
}