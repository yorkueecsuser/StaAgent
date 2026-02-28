import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public Instant showBug(Instant instant) {
        // Original code
        Instant updatedInstant = instant.plus(1, ChronoUnit.WEEKS);

        // Mutant code - duplicate assignment without method invocation
        long updatedMillis = updatedInstant.toEpochMilli();
        long dupUpdatedMillis = updatedMillis;

        return updatedInstant;
    }
}