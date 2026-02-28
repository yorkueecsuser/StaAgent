import java.time.Duration;
import java.time.Period;

class PeriodDurationDemo {

    public void showBug() {
        Period period = Period.ofDays(10);
        period = Period.ofDays(10); // Duplicated assignment statement
        Duration duration = Duration.ofHours(5);

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
}