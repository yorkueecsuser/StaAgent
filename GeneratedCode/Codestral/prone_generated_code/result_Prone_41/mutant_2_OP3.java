import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public Duration showBug(Duration duration) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            duration.get(ChronoUnit.MINUTES); // This line will not execute as the condition is always false
        }
        return duration;
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        DurationGetTemporalUnitBug bug = new DurationGetTemporalUnitBug();
        Duration duration = Duration.ofSeconds(120);
        bug.showBug(duration);
    }
}