import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public Instant showBug(Instant instant) {
        if (getUnreachableCondition()) {
            // Unreachable mutant code
            return instant.plus(2, ChronoUnit.MONTHS);
        }

        // Original code
        return instant.plus(1, ChronoUnit.WEEKS);
    }
}