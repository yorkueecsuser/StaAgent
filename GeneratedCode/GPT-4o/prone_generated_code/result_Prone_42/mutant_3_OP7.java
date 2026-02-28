import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationExample {

    public void showBug() {
        // This will throw a DateTimeException because YEARS is not a supported TemporalUnit for Duration
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit

        // Unreachable while loop mutation
        boolean conditionWhile = getCondition(); // Using a method to get a non-final condition
        while (conditionWhile) {
            // This block is intentionally unreachable
            System.out.println("This line is unreachable.");
        }
    }

    public static void main(String[] args) {
        DurationExample example = new DurationExample();
        try {
            example.showBug();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }

    // Method to return a condition that is always false but not a compile-time constant
    private boolean getCondition() {
        return false;
    }
}