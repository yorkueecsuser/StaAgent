import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        System.out.println(getHashCode());
    }

    public static int getHashCode() {
        // BUG: SuspiciousHashcodeMethodName
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            /* code */
        }
        return 12345;
    }
}