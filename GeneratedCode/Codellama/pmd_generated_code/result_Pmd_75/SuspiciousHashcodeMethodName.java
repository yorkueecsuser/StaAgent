import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        System.out.println(getHashCode());
    }

    public static int getHashCode() {
        // BUG: SuspiciousHashcodeMethodName
        boolean condition = getCondition();
        while (condition) {
            System.out.println("This is a unreachable while loop");
        }
        return 12345;
    }
}