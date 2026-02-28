import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {

    public String showBug() {
        Instant now = Instant.now();
        // Attempting to add WEEKS to an Instant, which is not supported
        Instant future = now.plus(1, ChronoUnit.WEEKS); // BUG: InstantTemporalUnit
        return future.toString();

        // Mutated code
        Instant a = Instant.now();
        // Attempting to add WEEKS to an Instant, which is not supported
        Instant b = a.plus(1, ChronoUnit.WEEKS); // BUG: InstantTemporalUnit
        return b.toString();
    }

    public static void main(String[] args) {
        InstantTemporalUnitBug bugDemo = new InstantTemporalUnitBug();
        System.out.println(bugDemo.showBug());

        // Mutated code
        InstantTemporalUnitBug c = new InstantTemporalUnitBug();
        System.out.println(c.showBug());
    }
}