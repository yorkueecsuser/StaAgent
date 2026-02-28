import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public Instant showBug(Instant instant) {
        // Original code
        return instant.plus(1, ChronoUnit.WEEKS);

        // Added mutant code: Unreachable switch statement
        boolean shouldRun = getCondition();
        if (!shouldRun) {
            int value = 0;
            switch (value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }
    }

    // Method to dynamically determine the condition at runtime
    private boolean getCondition() {
        // Add your condition logic here
        return false;
    }
}