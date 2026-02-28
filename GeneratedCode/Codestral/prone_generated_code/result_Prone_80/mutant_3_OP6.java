import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public Instant showBug(Instant instant) {
        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("This code will never execute");
        }

        // Original code
        return instant.plus(1, ChronoUnit.WEEKS);
    }

    // Method to dynamically determine the condition for the for loop
    private boolean getCondition() {
        return false;
    }
}