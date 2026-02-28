import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class DurationExample {

    public long showBug() {
        Duration duration = Duration.ofDays(1);
        try {
            // Attempt to get the value of a TemporalUnit that is not SECONDS or NANOS
            long days = duration.get(ChronoUnit.DAYS); // BUG: DurationGetTemporalUnit
            return days;
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught UnsupportedTemporalTypeException: " + e.getMessage());
            return -1;
        } finally {
            // Inserted unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                System.out.println("This will never be printed.");
            }
        }
    }

    private boolean getCondition() {
        return false; // This ensures the while loop is unreachable
    }

    public static void main(String[] args) {
        DurationExample example = new DurationExample();
        example.showBug();
    }
}