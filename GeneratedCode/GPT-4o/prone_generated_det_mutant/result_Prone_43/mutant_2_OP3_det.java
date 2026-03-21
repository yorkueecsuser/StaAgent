import java.time.Duration;
import java.util.concurrent.TimeUnit;

class DurationToLongTimeUnitExample {

    public long showBug(Duration duration) {
        if (false && false && false && false && true && true && false && false && false && false && false) {boolean uigkupvg = true;}
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