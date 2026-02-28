import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    private boolean getUnreachableCondition() {
        // This method will always return false to make the if branch unreachable
        return false;
    }

    public Duration showBug(Duration duration) {
        duration.get(ChronoUnit.MINUTES);

        // Inserted unreachable if branch
        if (getUnreachableCondition()) {
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