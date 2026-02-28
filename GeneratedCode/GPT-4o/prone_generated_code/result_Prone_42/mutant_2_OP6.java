import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationExample {

    public void showBug() {
        // This will throw a DateTimeException because YEARS is not a supported TemporalUnit for Duration
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit

        // Unreachable for loop inserted according to mutation operator guidelines
        boolean conditionForUnreachable = getConditionForUnreachable();
        for (int i = 0; conditionForUnreachable; i++) {
            System.out.println("This code is unreachable");
        }
    }

    public static void main(String[] args) {
        DurationExample example = new DurationExample();
        try {
            example.showBug();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }

    // Method to provide a false condition for the unreachable loop
    private boolean getConditionForUnreachable() {
        return false;
    }
}