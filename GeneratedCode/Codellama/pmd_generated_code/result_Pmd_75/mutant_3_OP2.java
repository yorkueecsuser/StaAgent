import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        System.out.println(getHashCode());
    }

    public static int getHashCode() {
        // BUG: SuspiciousHashcodeMethodName
        return 12345;
    }

    // Mutant 1: Duplicating the assignment statement
    public static int getHashCode() {
        return 12345;
    }
}