import java.time.Duration;

class ConstantOverflow {
    public static void main(String[] args) {
        // BUG: ConstantOverflow
        long nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
        System.out.println(nanosPerDay);

        // Unreachable while loop mutation
        boolean shouldRun = getCondition();
        while (shouldRun) {
            // code
        }
    }

    private static boolean getCondition() {
        return false;
    }
}