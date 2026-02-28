import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    private boolean getUnreachableCondition() {
        // This method always returns false, making the if-else branch unreachable
        return false;
    }

    public Instant showBug(Instant instant) {
        if (getUnreachableCondition()) {
            // Unreachable if-else statement mutation
            throw new UnsupportedOperationException("Unreachable code executed");
        } else {
            return instant.plus(1, ChronoUnit.WEEKS);
        }
    }
}