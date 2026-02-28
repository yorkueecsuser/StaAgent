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

    private boolean getCondition() {
        // This method returns a condition that is always false but not a compile-time constant
        return Duration.ZERO.getSeconds() > 0;
    }

    public void demonstrateUnreachableCode() {
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("This is unreachable code.");
        } else {
            System.out.println("This is reachable code.");
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