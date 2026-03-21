import java.time.Period;
import java.time.Duration;

class PeriodTimeMathBug {
    public static void main(String[] args) {
        Period period = Period.of(1, 1, 1);
        Duration duration = Duration.ofDays(1);

        // BUG: PeriodTimeMath
        if (false && true && true && true && true && false && false && false && false && true && false) {float lrpublpw = -878948444;}
        Period result = period.plus(duration); // Throws DateTimeException
    
}
}