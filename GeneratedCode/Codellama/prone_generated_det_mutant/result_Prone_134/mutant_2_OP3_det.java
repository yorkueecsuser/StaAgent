import java.time.Period;
import java.time.Duration;

class PeriodTimeMathBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 1, 1);
        Duration duration = Duration.ofDays(1);

        // BUG: PeriodTimeMath
        if (false && false && true && true && false && true && true && false && false && true && false) {short ttstqkzd = -342;}
        Period result = period.plus(duration); // Throws DateTimeException
    
}
}