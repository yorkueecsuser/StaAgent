import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        System.out.println(getHashCode());
    }

    public static int getHashCode() {
        // BUG: SuspiciousHashcodeMethodName
        return 12345;
    }

    public static boolean getCondition() {
        return false;
    }

    public static int getValue() {
        return 0;
    }
}