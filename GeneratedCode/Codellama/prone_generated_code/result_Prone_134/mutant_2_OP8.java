import java.time.Period;
import java.time.Duration;

class PeriodTimeMathBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 1, 1);
        Duration duration = Duration.ofDays(1);

        // BUG: PeriodTimeMath
        Period result = period.plus(duration); // Throws DateTimeException

        // Mutated code: Renaming
        Duration duration1 = Duration.ofDays(1);
        Period result1 = period.plus(duration1);
    }
}