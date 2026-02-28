import java.time.Duration;
import java.time.Period;

class PeriodDurationDemo {

    public void showBug() {
        Period period = Period.ofDays(10);
        Duration duration = Duration.ofHours(5);

        // This will throw a DateTimeException because Period cannot be combined with Duration
        Period result = period.plus(duration); // BUG: PeriodTimeMath
        
        // Unreachable if-else branch added
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is a reachable statement.");
        } else {
            // This branch is unreachable because the condition is always false at runtime
            System.out.println("This is an unreachable statement.");
        }
    }

    // Method to simulate a condition that is always false at runtime
    private boolean getCondition() {
        return false;
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