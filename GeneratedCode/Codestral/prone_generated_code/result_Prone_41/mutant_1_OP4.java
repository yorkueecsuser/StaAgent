import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public boolean getCondition() {
        return false;
    }

    public Duration showBug(Duration duration) {
        // BUG: DurationGetTemporalUnit
        duration.get(ChronoUnit.MINUTES);

        // MUTATION: Unreachable if-else statement
        if (getCondition()) {
            // This code is unreachable
            int x = 10;
            System.out.println("Unreachable code executed");
        } else {
            // This code is also unreachable
            int y = 20;
            System.out.println("This code should never be executed");
        }

        return duration;
    }

    public static void main(String[] args) {
        DurationGetTemporalUnitBug bug = new DurationGetTemporalUnitBug();
        Duration duration = Duration.ofSeconds(120);
        bug.showBug(duration);
    }
}