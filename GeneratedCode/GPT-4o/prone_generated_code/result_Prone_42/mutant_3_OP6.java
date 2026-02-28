import java.time.Duration;
import java.time.temporal.ChronoUnit;

class DurationExample {

    public void showBug() {
        // This will throw a DateTimeException because YEARS is not a supported TemporalUnit for Duration
        Duration duration = Duration.of(1, ChronoUnit.YEARS); // BUG: DurationTemporalUnit

        // Inserted unreachable for loop
        boolean executeLoop = getCondition(); // This method dynamically determines the loop condition
        for (int i = 0; executeLoop; i++) {
            System.out.println("This line will never be executed.");
        }
    }

    // Method to provide a non-final boolean condition
    private boolean getCondition() {
        return false;
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