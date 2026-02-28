import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    private boolean getFalseCondition() {
        return false;
    }

    public Duration showBug(Duration duration) {
        // BUG: DurationGetTemporalUnit
        duration.get(ChronoUnit.MINUTES); // This line will throw UnsupportedTemporalTypeException

        // Mutation: Unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            System.out.println("This line will never be executed.");
        }

        return duration;
    }

    public static void main(String[] args) {
        DurationGetTemporalUnitBug bug = new DurationGetTemporalUnitBug();
        Duration duration = Duration.ofSeconds(120);
        bug.showBug(duration);
    }
}