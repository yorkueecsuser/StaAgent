import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {

    public String showBug() {
        Instant now = Instant.now();
        // Attempting to add WEEKS to an Instant, which is not supported
        Instant future = now.plus(1, ChronoUnit.WEEKS); // BUG: InstantTemporalUnit

        // Inserting an unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because getCondition() always returns false
            future = now.plus(2, ChronoUnit.DAYS);
        } else {
            // This block will always execute
            future = now.plus(1, ChronoUnit.HOURS);
        }

        return future.toString();
    }

    private boolean getCondition() {
        // Always return false to make the if branch unreachable
        return false;
    }

    public static void main(String[] args) {
        InstantTemporalUnitBug bugDemo = new InstantTemporalUnitBug();
        System.out.println(bugDemo.showBug());
    }
}