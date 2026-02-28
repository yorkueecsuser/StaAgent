import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationTemporalUnitBug {
    public static void main(String[] args) {
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit
        System.out.println(duration);

        // Mutated code: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This branch is unreachable!");
        } else {
            System.out.println("This branch is reachable due to the mutated condition.");
        }
    }
}