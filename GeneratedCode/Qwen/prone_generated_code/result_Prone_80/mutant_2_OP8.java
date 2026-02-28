import java.time.Instant;
import java.time.temporal.ChronoUnit;

class InstantTemporalUnitBug {

    public String showBug() {
        Instant now = Instant.now();
        // Attempting to add WEEKS to an Instant, which is not supported
        Instant future = now.plus(1, ChronoUnit.WEEKS); // BUG: InstantTemporalUnit
        return future.toString();

        // Mutant code with variable renaming
        Instant x = Instant.now();
        // Attempting to add WEEKS to an Instant, which is not supported
        Instant y = x.plus(1, ChronoUnit.WEEKS); // BUG: InstantTemporalUnit
        return y.toString();
    }

    public static void main(String[] args) {
        InstantTemporalUnitBug bugDemo = new InstantTemporalUnitBug();
        System.out.println(bugDemo.showBug());

        // Mutant code with variable renaming
        InstantTemporalUnitBug a = new InstantTemporalUnitBug();
        System.out.println(a.showBug());
    }
}