import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class DurationExample {

    public long showBug() {
        Duration duration = Duration.ofDays(1);
        boolean unreachableCondition = shouldExecute();
        if (unreachableCondition) {
            // This block is unreachable because shouldExecute returns false
            System.out.println("This should never print.");
        }
        try {
            // Attempt to get the value of a TemporalUnit that is not SECONDS or NANOS
            long days = duration.get(ChronoUnit.DAYS); // BUG: DurationGetTemporalUnit
            return days;
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught UnsupportedTemporalTypeException: " + e.getMessage());
            return -1;
        }
    }

    private boolean shouldExecute() {
        // This method always returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        DurationExample example = new DurationExample();
        example.showBug();
    }
}