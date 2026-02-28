import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        System.out.println(getHashCode());
    }

    public static int getHashCode() {
        // BUG: SuspiciousHashcodeMethodName
        // Unreachable switch statement mutation
        int value = getValue();
        switch (value) {
            case 1:
                // code
                break;
            default:
                // code
                break;
        }
        return 12345;
    }

    private static int getValue() {
        return 0;
    }
}