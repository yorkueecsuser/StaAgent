import java.time.Period;
import java.time.Duration;

class PeriodTimeMathBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 1, 1);
        Duration duration = Duration.ofDays(1);

        // BUG: PeriodTimeMath
        Period result = period.plus(duration); // Throws DateTimeException

        // Inserted unreachable if-else statement mutant
        if (false) {
            result = period.plusDays(duration.toDays());
        } else {
            result = period.plusMonths(duration.toMonths());
        }
    }
}