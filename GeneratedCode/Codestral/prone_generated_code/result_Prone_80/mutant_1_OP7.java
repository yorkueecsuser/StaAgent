import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    private boolean getUnreachableCondition() {
        return false;  // This method always returns false
    }

    public Instant showBug(Instant instant) {
        // BUG: Instant APIs only work for NANOS, MICROS, MILLIS, SECONDS, MINUTES, HOURS, HALF_DAYS and DAYS.
        // Trying to use a different unit will result in an UnsupportedTemporalTypeException.
        while (getUnreachableCondition()) { // The condition is always false, making this loop unreachable.
            System.out.println("This code is unreachable.");
        }
        return instant.plus(1, ChronoUnit.WEEKS);
    }
}