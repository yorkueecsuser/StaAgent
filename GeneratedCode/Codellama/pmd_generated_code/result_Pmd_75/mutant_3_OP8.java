import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        System.out.println(getHashCode());
    }

    public static int z() {
        // BUG: SuspiciousHashcodeMethodName
        return 12345;
    }
}