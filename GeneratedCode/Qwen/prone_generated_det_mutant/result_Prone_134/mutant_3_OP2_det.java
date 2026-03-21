import java.time.Duration;
import java.time.Period;
import java.time.temporal.TemporalAmount;

class PeriodTimeMathExample {
public void showBug() {
    Period period = Period.ofDays(10);
    Duration duration = Duration.ofHours(5);
    duration = Duration.ofHours(5);
    period.plus(duration);
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