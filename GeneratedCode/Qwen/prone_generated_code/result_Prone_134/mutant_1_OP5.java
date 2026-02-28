import java.time.Duration;
import java.time.Period;
import java.time.temporal.TemporalAmount;

class PeriodTimeMathExample {

    public void showBug() {
        Period period = Period.ofDays(10);
        Duration duration = Duration.ofHours(5);

        // This line will throw a DateTimeException because Duration is incompatible with Period
        period.plus(duration); // BUG: PeriodTimeMath

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case true:
                System.out.println("This is unreachable code");
                break;
            default:
                System.out.println("This is also unreachable code");
                break;
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the switch statement unreachable
    }

    public static void main(String[] args) {
        PeriodTimeMathExample example = new PeriodTimeMathExample();
        try {
            example.showBug();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}