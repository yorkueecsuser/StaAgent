import java.time.Duration;
import java.time.Period;

class PeriodDurationDemo {

    public void showBug() {
        Period period = Period.ofDays(10);
        Duration duration = Duration.ofHours(5);

        // This will throw a DateTimeException because Period cannot be combined with Duration
        Period result = period.plus(duration); // BUG: PeriodTimeMath

        // Unreachable switch statement added
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This should never be printed.");
                break;
            default:
                // This default case ensures the switch is complete
                break;
        }
    }

    // Method to provide a runtime-determined value
    private int getUnreachableValue() {
        return 0; // Ensures the switch case for 1 is never reached
    }

    public static void main(String[] args) {
        PeriodDurationDemo demo = new PeriodDurationDemo();
        try {
            demo.showBug();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}