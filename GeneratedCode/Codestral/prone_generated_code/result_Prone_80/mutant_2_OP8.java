import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public Instant showBug(Instant instant) {
        // Original code
        Instant updatedInstant = instant.plus(1, ChronoUnit.WEEKS);

        // Mutant code
        Instant r = instant; // Renamed 'updatedInstant' to 'r'

        return updatedInstant;
    }
}