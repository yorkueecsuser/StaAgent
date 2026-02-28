import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {

    public String showBug() {
        Instant now = Instant.now();
        // Attempting to add WEEKS to an Instant, which is not supported
        Instant future = now.plus(1, ChronoUnit.WEEKS); // BUG: InstantTemporalUnit

        // Introduced unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case will never be executed because condition is always false
                future = now.plus(1, ChronoUnit.DAYS);
                break;
            default:
                // Default case will also never be executed due to the same reason
                future = now.plus(1, ChronoUnit.HOURS);
                break;
        }

        return future.toString();
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }

    public static void main(String[] args) {
        InstantTemporalUnitBug bugDemo = new InstantTemporalUnitBug();
        System.out.println(bugDemo.showBug());
    }
}