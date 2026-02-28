import java.time.Duration;

class ConstantOverflow {
    public static void main(String[] args) {
        // BUG: ConstantOverflow
        long nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
        boolean condition = getCondition();
        if (condition) {
            System.out.println(nanosPerDay);
        }
        System.out.println(nanosPerDay);
    }

    private static boolean getCondition() {
        return false;
    }
}