import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        System.out.println(getHashCode());
    }

    public static int getHashCode() {
        // BUG: SuspiciousHashcodeMethodName
        int value = getValue();
        switch (value) {
            case 0:
                return 12345;
            default:
                return 0;
        }
    }

    private static int getValue() {
        return 0;
    }
}