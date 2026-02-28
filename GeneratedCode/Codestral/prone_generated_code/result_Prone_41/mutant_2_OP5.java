import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationGetTemporalUnitBug {
    public Duration showBug(Duration duration) {
        // BUG: DurationGetTemporalUnit
        duration.get(ChronoUnit.MINUTES); // This line will throw UnsupportedTemporalTypeException

        // MUTANT: Unreachable switch statement
        final boolean alwaysFalse = getCondition();
        if (alwaysFalse) {
            int value = 0; // or any constant value that is not used in the case statements
            switch(value) {
                case 1:
                    // Unreachable code
                    System.out.println("This should never be printed!");
                    break;
                default:
                    // This is the only reachable code
                    break;
            }
        }

        return duration;
    }

    private boolean getCondition() {
        return false; // This method always returns false to ensure the switch statement is unreachable
    }

    public static void main(String[] args) {
        DurationGetTemporalUnitBug bug = new DurationGetTemporalUnitBug();
        Duration duration = Duration.ofSeconds(120);
        bug.showBug(duration);
    }
}