import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public Instant showBug(Instant instant) {
        // Original code
        Instant updatedInstant = instant.plus(1, ChronoUnit.WEEKS);

        // Mutated code
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This loop will never execute
            System.out.println("Unreachable code");
        }

        return updatedInstant;
    }
}