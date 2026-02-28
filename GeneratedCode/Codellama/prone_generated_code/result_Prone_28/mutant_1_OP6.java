import java.time.Duration;

class ConstantOverflow {
    public static void main(String[] args) {
        // BUG: ConstantOverflow
        long nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
        System.out.println(nanosPerDay);
        // Unreachable for loop mutation
        for (int i = 0; getConditionFor(); i++) {
            // code
        }
    }

    private static boolean getConditionFor() {
        // Mutant code being added MUST be unique not generic
        // Generated mutated Java code MUST avoid unreachable statement error
        return false;
    }
}