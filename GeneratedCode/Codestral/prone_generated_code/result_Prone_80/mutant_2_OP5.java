import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public Instant showBug(Instant instant) {
        if (getUnreachableCondition()) {
            switch (ChronoUnit.ERAS) {
                case WEEKS:
                    return instant.plus(1, ChronoUnit.WEEKS);
            }
        }
        return instant.plus(1, ChronoUnit.DAYS);
    }
}