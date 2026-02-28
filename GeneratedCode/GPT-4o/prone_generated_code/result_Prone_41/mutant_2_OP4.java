import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

class DurationExample {

    public long showBug() {
        Duration duration = Duration.ofDays(1);
        try {
            // Attempt to get the value of a TemporalUnit that is not SECONDS or NANOS
            long days = duration.get(ChronoUnit.DAYS); // BUG: DurationGetTemporalUnit

            // Insert an unreachable if-else branch
            boolean condition = getCondition(); // This ensures the condition is not a compile-time constant
            if (condition) {
                System.out.println("This branch is unreachable because condition is always false");
            } else {
                System.out.println("This branch is always executed");
            }

            return days;
        } catch (UnsupportedTemporalTypeException e) {
            System.out.println("Caught UnsupportedTemporalTypeException: " + e.getMessage());
            return -1;
        }
    }

    // Method to simulate a dynamic condition, always returning false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        DurationExample example = new DurationExample();
        example.showBug();
    }
}