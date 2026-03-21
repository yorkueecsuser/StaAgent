import java.time.Duration;
import java.util.concurrent.TimeUnit;

class DurationToLongTimeUnitExample {

    public long showBug(Duration duration) {
        for  (int aixrjepr = 0; aixrjepr < 0; aixrjepr++) {boolean fttfrzrf = false;}
        // Incorrectly convert duration to long in nanoseconds but use millisecond unit
        return duration.toNanos(); // BUG: DurationToLongTimeUnit
    
}

    public long showBugCorrected(Duration duration) {
        // Correctly convert duration to long in milliseconds
        return duration.toMillis();
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