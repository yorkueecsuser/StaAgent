import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public Duration showBug(Duration duration) {
        // BUG: DurationGetTemporalUnit
        duration.get(ChronoUnit.MINUTES); // This line will throw UnsupportedTemporalTypeException

        // Mutant: Unreachable switch statement
        if (getUnreachableCondition()) {
            int value = 0;
            switch(value) {
                case 1:
                    System.out.println("This line should never be reached.");
                    break;
            }
        }
        return duration;
    }

    public static void main(String[] args) {
        DurationGetTemporalUnitBug bug = new DurationGetTemporalUnitBug();
        Duration duration = Duration.ofSeconds(120);
        bug.showBug(duration);
    }
}