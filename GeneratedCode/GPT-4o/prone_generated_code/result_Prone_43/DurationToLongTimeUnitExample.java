import java.time.Duration;
import java.util.concurrent.TimeUnit;

class DurationToLongTimeUnitExample {

    public long showBug(Duration duration) {
        // Incorrectly convert duration to long in nanoseconds but use millisecond unit
        return duration.toNanos(); // BUG: DurationToLongTimeUnit
    }

    public long showBugCorrected(Duration duration) {
        // Correctly convert duration to long in milliseconds
        return duration.toMillis();
    }

    // Method to provide a false condition dynamically
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        DurationToLongTimeUnitExample example = new DurationToLongTimeUnitExample();
        Duration duration = Duration.ofSeconds(1);

        // Demonstrate the bug
        System.out.println("Incorrect conversion: " + example.showBug(duration));

        // Demonstrate the corrected version
        System.out.println("Correct conversion: " + example.showBugCorrected(duration));

        // Unreachable while loop
        boolean conditionWhile = example.getFalseCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop.");
        }
    }
}