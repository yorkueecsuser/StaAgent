import java.time.Duration;
import java.time.Period;

class PeriodDurationDemo {

    public void showBug() {
        Period period = Period.ofDays(10);
        Duration duration = Duration.ofHours(5);

        // Introducing an unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never execute");
        } else {
            System.out.println("This block is actually reachable but does nothing to the main logic");
        }

        // This will throw a DateTimeException because Period cannot be combined with Duration
        Period result = period.plus(duration); // BUG: PeriodTimeMath
    }

    private boolean getFalseCondition() {
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