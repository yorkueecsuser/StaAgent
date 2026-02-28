import java.time.Duration;
import java.time.Period;

class PeriodDurationDemo {

    public void showBug() {
        Period period = Period.ofDays(10);
        Duration duration = Duration.ofHours(5);

        // This will throw a DateTimeException because Period cannot be combined with Duration
        Period result = period.plus(duration); // BUG: PeriodTimeMath

        // Unreachable if-else statement mutation
        boolean condition = getCondition(); // A method that returns false
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This branch is always executed.");
        }
    }

    private boolean getCondition() {
        return false; // Ensures the if condition is always false
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