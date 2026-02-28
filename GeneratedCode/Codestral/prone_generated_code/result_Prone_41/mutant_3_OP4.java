import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public Duration showBug(Duration duration) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable mutant code
            duration.get(ChronoUnit.MINUTES); // This line will throw UnsupportedTemporalTypeException
        } else {
            // Alternative unreachable code
            System.out.println("This line should never be executed");
        }
        return duration;
    }

    private boolean getCondition() {
        // Replace this with your actual condition
        return false;
    }

    public static void main(String[] args) {
        DurationGetTemporalUnitBug bug = new DurationGetTemporalUnitBug();
        Duration duration = Duration.ofSeconds(120);
        bug.showBug(duration);
    }
}