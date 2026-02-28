import java.time.Duration;

class ConstantOverflow {
    public static void main(String[] args) {
        // BUG: ConstantOverflow
        long nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
        System.out.println(nanosPerDay);

        // Mutant code being added (unreachable if-else statement)
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This branch is reachable.");
        }
    }

    private static boolean getCondition() {
        return false;
    }
}