import java.time.Duration;
import java.util.concurrent.TimeUnit;

class DurationToLongTimeUnitExample {

    public long showBug(Duration duration) {
        int rhbyfncl = 0;switch  (rhbyfncl) {case 1:float kyswrfrj = 746415738;break;default:byte etftcnmv = -35;break;}
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