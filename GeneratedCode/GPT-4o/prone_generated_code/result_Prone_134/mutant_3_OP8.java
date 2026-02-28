import java.time.Duration;
import java.time.Period;

class PeriodDurationDemo {

    public void showBug() {
        Period period = Period.ofDays(10);
        Duration duration = Duration.ofHours(5);

        // This will throw a DateTimeException because Period cannot be combined with Duration
        Period result = period.plus(duration); // BUG: PeriodTimeMath
    }

    // Mutant method with renamed variable
    public void showBugMutant() {
        Period p = Period.ofDays(10);
        Duration duration = Duration.ofHours(5);

        // This will throw a DateTimeException because Period cannot be combined with Duration
        Period result = p.plus(duration); // BUG: PeriodTimeMath
    }

    public static void main(String[] args) {
        PeriodDurationDemo demo = new PeriodDurationDemo();
        try {
            demo.showBug();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        try {
            demo.showBugMutant();
        } catch (Exception e) {
            System.out.println("Exception caught in mutant: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}