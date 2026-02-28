import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {

    public String showBug() {
        Instant now = Instant.now();
        // Attempting to add WEEKS to an Instant, which is not supported
        Instant future = now.plus(1, ChronoUnit.WEEKS); // BUG: InstantTemporalUnit
        Instant futureCopy = now.plus(1, ChronoUnit.WEEKS); // DUPLICATION: Duplicate of the buggy line for demonstration
        return future.toString();
    }

    public static void main(String[] args) {
        InstantTemporalUnitBug bugDemo = new InstantTemporalUnitBug();
        System.out.println(bugDemo.showBug());
    }
}