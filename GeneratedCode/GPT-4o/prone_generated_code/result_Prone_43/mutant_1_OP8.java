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

    public long showBugMutant(Duration duration) {
        // Incorrectly convert duration to long in nanoseconds but use millisecond unit
        return duration.toNanos(); // BUG: DurationToLongTimeUnit
    }

    public long showBugCorrectedMutant(Duration duration) {
        // Correctly convert duration to long in milliseconds
        return duration.toMillis();
    }

    public static void main(String[] args) {
        DurationToLongTimeUnitExample a = new DurationToLongTimeUnitExample();
        Duration b = Duration.ofSeconds(1);

        // Demonstrate the bug
        System.out.println("Incorrect conversion: " + a.showBug(b));

        // Demonstrate the corrected version
        System.out.println("Correct conversion: " + a.showBugCorrected(b));

        // Demonstrate the mutant bug
        System.out.println("Mutant incorrect conversion: " + a.showBugMutant(b));

        // Demonstrate the corrected mutant version
        System.out.println("Mutant correct conversion: " + a.showBugCorrectedMutant(b));
    }
}