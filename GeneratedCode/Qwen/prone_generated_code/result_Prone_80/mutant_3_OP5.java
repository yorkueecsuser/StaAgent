import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {

    public String showBug() {
        Instant now = Instant.now();
        // Attempting to add WEEKS to an Instant, which is not supported
        Instant future = now.plus(1, ChronoUnit.WEEKS); // BUG: InstantTemporalUnit

        // Introduced an unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                // This case will never be executed because getCondition() returns false
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case to ensure the switch is not empty
                break;
        }

        return future.toString();
    }

    private boolean getCondition() {
        // Always returns false to ensure the switch statement is unreachable
        return false;
    }

    public static void main(String[] args) {
        InstantTemporalUnitBug bugDemo = new InstantTemporalUnitBug();
        System.out.println(bugDemo.showBug());
    }
}