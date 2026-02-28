import java.time.Duration;
import java.util.concurrent.TimeUnit;

class DurationToLongTimeUnitExample {

    public long showBug(Duration duration) {
        // Incorrectly convert duration to long in nanoseconds but use millisecond unit
        return duration.toNanos(); // BUG: DurationToLongTimeUnit
        
        // Unreachable if-else branch added
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This block is never executed");
        } else {
            System.out.println("This block is always executed");
        }
    }

    public long showBugCorrected(Duration duration) {
        // Correctly convert duration to long in milliseconds
        return duration.toMillis();
        
        // Unreachable if-else branch added
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This block is never executed");
        } else {
            System.out.println("This block is always executed");
        }
    }

    private boolean getFalseCondition() {
        // This method always returns false
        return false;
    }

    public static void main(String[] args) {
        DurationToLongTimeUnitExample example = new DurationToLongTimeUnitExample();
        Duration duration = Duration.ofSeconds(1);

        // Demonstrate the bug
        System.out.println("Incorrect conversion: " + example.showBug(duration));

        // Demonstrate the corrected version
        System.out.println("Correct conversion: " + example.showBugCorrected(duration));
    }
}