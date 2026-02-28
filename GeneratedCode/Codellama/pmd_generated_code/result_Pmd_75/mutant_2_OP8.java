import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        System.out.println(getHashCode());
    }

    public static int getHashCode() {
        // BUG: SuspiciousHashcodeMethodName
        return 12345;
    }

    // Mutant 1: Renaming the variable "getHashCode" to "a"
    public static int a() {
        return 12345;
    }
}