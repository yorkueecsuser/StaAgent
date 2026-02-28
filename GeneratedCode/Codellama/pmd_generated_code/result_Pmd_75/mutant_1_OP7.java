import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        System.out.println(getHashCode());
    }

    public static int getHashCode() {
        // BUG: SuspiciousHashcodeMethodName
        while (false) {
            // Inserting unreachable while loop to make the hashcode always return 12345
            return 12345;
        }
        return 12345;
    }
}