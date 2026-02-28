import java.time.Period;
import java.time.Duration;

class PeriodTimeMathBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 1, 1);
        Duration duration = Duration.ofDays(1);

        // BUG: PeriodTimeMath
        // Inserted unreachable for loop
        for (int i = 0; false; i++) {
            // Do nothing
        }
        Period result = period.plus(duration); // Throws DateTimeException
    }
}