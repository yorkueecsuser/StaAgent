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
            return 0;
        }
    }
}