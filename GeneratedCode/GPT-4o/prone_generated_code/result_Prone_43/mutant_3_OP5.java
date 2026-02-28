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

    private int getUnreachableSwitchValue() {
        return 2; // This value is intentionally chosen not to match any case in the switch
    }

    public void demonstrateUnreachableSwitch() {
        int value = getUnreachableSwitchValue();
        switch (value) {
            case 1:
                System.out.println("This is case 1");
                break;
            case 3:
                System.out.println("This is case 3");
                break;
            default:
                // Intentionally left blank to simulate unreachable cases
                break;
        }
    }

    public static void main(String[] args) {
        DurationToLongTimeUnitExample example = new DurationToLongTimeUnitExample();
        Duration duration = Duration.ofSeconds(1);

        // Demonstrate the bug
        System.out.println("Incorrect conversion: " + example.showBug(duration));

        // Demonstrate the corrected version
        System.out.println("Correct conversion: " + example.showBugCorrected(duration));

        // Call the method with unreachable switch
        example.demonstrateUnreachableSwitch();
    }
}