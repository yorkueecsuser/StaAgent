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

    // Method to dynamically determine the condition at runtime
    private boolean getCondition() {
        return System.currentTimeMillis() < 0; // This condition is always false
    }

    public void demonstrateUnreachableCode() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable, but the condition is not a compile-time constant
            System.out.println("This is unreachable code.");
        } else {
            // This block will always execute
            System.out.println("This is the reachable alternative code.");
        }
    }

    public static void main(String[] args) {
        DurationToLongTimeUnitExample example = new DurationToLongTimeUnitExample();
        Duration duration = Duration.ofSeconds(1);

        // Demonstrate the bug
        System.out.println("Incorrect conversion: " + example.showBug(duration));

        // Demonstrate the corrected version
        System.out.println("Correct conversion: " + example.showBugCorrected(duration));

        // Demonstrate the unreachable code
        example.demonstrateUnreachableCode();
    }
}