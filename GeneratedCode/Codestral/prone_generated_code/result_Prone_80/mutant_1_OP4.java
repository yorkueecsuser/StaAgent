import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    private boolean getFalseCondition() {
        return false;
    }

    public Instant showBug(Instant instant) {
        if (getFalseCondition()) {
            // Unreachable mutant code
            return instant.plus(1, ChronoUnit.ERAS);
        }
        // Original code
        return instant.plus(1, ChronoUnit.WEEKS);
    }
}