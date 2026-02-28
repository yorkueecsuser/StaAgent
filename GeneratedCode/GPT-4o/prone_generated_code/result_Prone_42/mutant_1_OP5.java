import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationExample {

    public void showBug() {
        // This will throw a DateTimeException because YEARS is not a supported TemporalUnit for Duration
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit

        // Inserted unreachable switch statement
        int unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case 999: // This case will never be reached since getUnreachableCondition() never returns 999
                System.out.println("This code is unreachable.");
                break;
            default:
                // Do nothing
                break;
        }
    }

    private int getUnreachableCondition() {
        return 0; // Always returns 0, making the switch case unreachable
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