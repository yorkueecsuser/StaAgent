import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    public Instant showBug(Instant instant) {
        boolean unreachableSwitch = shouldNotExecute();
        // Unreachable switch statement mutant
        switch (ChronoUnit.WEEKS) {
            case NANOS:
                if (unreachableSwitch) {
                    throw new IllegalStateException("Unreachable code executed");
                }
                break;
            default:
                break;
        }
        // Original code
        return instant.plus(1, ChronoUnit.WEEKS);
    }

    private boolean shouldNotExecute() {
        // This method should always return false to make the switch statement unreachable
        return false;
    }
}