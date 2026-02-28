import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public Duration showBug(Duration duration) {
        // BUG: DurationGetTemporalUnit
        duration.get(ChronoUnit.MINUTES); // This line will throw UnsupportedTemporalTypeException

        // MUTANT: Unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            System.out.println("This code is unreachable");
        }

        return duration;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        DurationGetTemporalUnitBug bug = new DurationGetTemporalUnitBug();
        Duration duration = Duration.ofSeconds(120);
        bug.showBug(duration);
    }
}