import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationExample {

    public void showBug() {
        // This will throw a DateTimeException because YEARS is not a supported TemporalUnit for Duration
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit

        // Introducing an unreachable if statement using a non-final variable
        boolean shouldExecute = getFalseCondition(); // This will always return false
        if (shouldExecute) {
            // Unreachable code block
            System.out.println("This statement is unreachable.");
        }
    }

    // Method to simulate a condition that always returns false
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        DurationExample example = new DurationExample();
        try {
            example.showBug();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }
}