import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public Instant showBug(Instant instant) {
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // Unreachable while loop inserted per mutation operator information
            System.out.println("This line will never execute.");
        }
        return instant.plus(1, ChronoUnit.WEEKS);
    }
}