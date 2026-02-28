import java.time.Duration;
import java.time.Period;

class PeriodDurationDemo {

    public void showBug() {
        Period period = Period.ofDays(10);
        Duration duration = Duration.ofHours(5);

        // Unreachable while loop mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable loop.");
        }

        // This will throw a DateTimeException because Period cannot be combined with Duration
        Period result = period.plus(duration); // BUG: PeriodTimeMath
    }

    public static void main(String[] args) {
        PeriodDurationDemo demo = new PeriodDurationDemo();
        try {
            demo.showBug();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

    // Method to provide a non-constant condition
    private boolean getCondition() {
        return false;
    }
}