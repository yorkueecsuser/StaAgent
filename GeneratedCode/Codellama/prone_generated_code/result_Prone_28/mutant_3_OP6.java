import java.time.Duration;

class ConstantOverflow {
    public static void main(String[] args) {
        // BUG: ConstantOverflow
        long nanosPerDay = 24 * 60 * 60 * 1000 * 1000 * 1000;
        System.out.println(nanosPerDay);

        // Unreachable for loop mutation
        // Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
        // Generated mutated Java code MUST compile successfully.
        // Mutant code being added MUST be unique not generic.
        // Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
        // Generated mutated Java code MUST avoid unreachable statement error.
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable for loop: " + i);
        }
    }
}