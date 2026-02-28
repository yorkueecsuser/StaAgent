import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    private boolean getFalseCondition() {
        return false;
    }

    public Instant showBug(Instant instant) {
        // Original code
        Instant newInstant = instant.plus(1, ChronoUnit.WEEKS);

        // Unreachable if statement mutant
        if (getFalseCondition()) {
            // This branch is unreachable as the condition is always false.
            throw new UnsupportedOperationException("Unreachable branch executed.");
        }

        return newInstant;
    }
}