import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public Duration showBug(Duration duration) {
        // Original code
        duration.get(ChronoUnit.MINUTES);

        // Mutated code - Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This is an unreachable loop.");
        }

        return duration;
    }

    public static void main(String[] args) {
        DurationGetTemporalUnitBug bug = new DurationGetTemporalUnitBug();
        Duration duration = Duration.ofSeconds(120);
        bug.showBug(duration);
    }
}