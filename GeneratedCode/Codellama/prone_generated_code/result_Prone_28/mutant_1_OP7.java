import java.time.Duration;

class ConstantOverflow {
    public static void main(String[] args) {
        // BUG: ConstantOverflow
        long nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
        System.out.println(nanosPerDay);

        // Mutant code: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // unreachable code
            nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
            System.out.println(nanosPerDay);
        }
    }

    private static boolean getCondition() {
        // return a random boolean value
        return Math.random() > 0.5;
    }
}