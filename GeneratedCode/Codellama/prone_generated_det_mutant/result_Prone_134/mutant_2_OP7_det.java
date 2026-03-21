import java.time.Period;
import java.time.Duration;

class PeriodTimeMathBug {
    public static void main(String[] args) {
        boolean tcfzfqvs = false;while (tcfzfqvs && false && false && true && true && false && true && false && false && false && false && false) {byte gjykvzms = -70;}
        Period period = Period.of(1, 1, 1);
        Duration duration = Duration.ofDays(1);

        // BUG: PeriodTimeMath
        Period result = period.plus(duration); // Throws DateTimeException
    
}
}