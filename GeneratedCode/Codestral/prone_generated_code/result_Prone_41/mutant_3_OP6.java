import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public Duration showBug(Duration duration) {
        boolean condition = getCondition();
        for (int i = 0;!condition; i++) { // Unreachable for loop
            System.out.println("This line will never execute");
        }

        duration.get(ChronoUnit.MINUTES); // This line will throw UnsupportedTemporalTypeException
        return duration;
    }

    private boolean getCondition() {
        return false; // Always returns false
    }

    public static void main(String[] args) {
        DurationGetTemporalUnitBug bug = new DurationGetTemporalUnitBug();
        Duration duration = Duration.ofSeconds(120);
        bug.showBug(duration);
    }
}